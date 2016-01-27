

ScalaFX project is using [Mercurial](http://mercurial.selenic.com) (Hg) for version control. If you are a ScalaFX developer, it is important for you to get familiar with the way Mercurial works. Many consider Mercurial easier to learn than other distributed version control systems.

While Mercurial is similar to other version control systems, for instance Git, it has its own independent systems, with its own terminology and best practices.

# Learning Resources #

  * [Quick Start](http://mercurial.selenic.com/wiki/QuickStart)
  * [Branching and merging in Mercurial (and Git) explained](http://mercurial.selenic.com/wiki/BranchingExplained)
  * Mercurial [Standard Branching](http://mercurial.selenic.com/wiki/StandardBranching) model
  * [Bookmarks](http://mercurial.selenic.com/wiki/Bookmarks) - light-weight branching in Mercurial
  * [Hg Init: a Mercurial tutorial](http://hginit.com/)
  * [Mercurial: The Definitive Guide](http://hgbook.red-bean.com/) book by Bryan O'Sullivan, you can purchase or read it on-line.

# Repositories #

The ScalaFX project currently has two source repositories: one for the ScalaFX source code called ['default'](http://code.google.com/p/scalafx/source/checkout?repo=default) and one for its [Wiki](http://code.google.com/p/scalafx/source/checkout?repo=wiki) pages (like this one). Follow the links to see checkout instructions.

# Branching #

If you are familiar with Git, be aware that branches in Git and Mercurial have different live time. In particular, Mercurial stores its [named branch](http://mercurial.selenic.com/wiki/NamedBranches) information as a permanent part of each commit. This is useful for future auditing of long-lived branches as it's always possible to identify which branch a commit was introduced on. Git, by contrast, has branches that are not stored in history, which is useful for working with numerous short-lived feature branches, but makes future auditing impossible.

Mercurial's [bookmark](http://mercurial.selenic.com/wiki/Bookmarks) feature is analogous to Git's branching scheme, but can also be used in conjunction with Mercurial's traditional named branches.

## Default - Development Branch ##

Mercurial's main branch is called _default_. This is the branch that will be checked out by default when you clone. All regular development is done on _default_, except for hot-fixes.

"Feature branches" are created, if needed, only from the _default_ branch using [bookmarks](http://mercurial.selenic.com/wiki/Bookmarks) for light-weight branching. Do not use named branches, as they are permanent. Large number of branching over time will pollute the branch namespace, and may lead to performance issues.

Alternative way for creating "feature branches" is to clone the main ScalaFX repository within Google Code. To do it, click "Create a clone" button on the ScalaFX [Source](http://code.google.com/p/scalafx/source/checkout) page. Use clones for experimentation, sharing of ideas with others, and discussion on [scalafx-dev](https://groups.google.com/forum/?fromgroups=#!forum/scalafx-dev). Once the experimental feature is stable, the clone, or part of it, is merged into main repository. Creating a clone is an excellent way to contribute to ScalaFX if you do not have commit access to the main repository. Once your contributions are ready announce it on the [scalafx-dev](https://groups.google.com/forum/?fromgroups=#!forum/scalafx-dev).

## Stable - Release Branch ##

Following the [example](http://selenic.com/hg/branches) of the Mercurial project, ScalaFX is using a single release branch called _stable_. This branch is reused from release to release. On the _stable_ branch you only do hot-fixes, merges for release, and tagging for release.

At the time of a release code freeze, the _default_ branch is merged into the _stable_ branch. Version number is changed to the final for the release. The release is built and published of the _stable_ branch. Tag is created with the release name. After a release, changes made on the _stable_ branch are merged into the _default_ development branch.