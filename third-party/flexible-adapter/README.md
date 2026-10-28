# FlexibleAdapter: local build for translation testing

Source repository: https://github.com/arkon/FlexibleAdapter
Source revision: c80135339bcff5f7f8c2c2380329dfc155b26232
License: Apache-2.0; see LICENSE.

This module replaces the unavailable JitPack artifact only on the
translation-testing branch.

Java sources and Android resources are copied without modification.
The original build scripts are replaced by build.gradle.kts.
The manifest package attribute is replaced by the Android namespace
declared in build.gradle.kts.

The original module declares version 5.1.0 and RecyclerView 1.1.0.
VERSION_NAME is generated explicitly because SelectableAdapter uses it.
