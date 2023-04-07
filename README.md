An exciting new game

![](app-icon.png)

Install tauri and clojure and run

```bash
npm run tauri build
```

To find a MacOS application ready and waiting in `src-tauri/release/bundle/macos`.

---

<details>
  <summary>Original information</summary>

This project lays out a bare minimum template for using ClojureScript with
Tauri. Out of the box, the following is provided:

- Shadow CLJS
- React
- Reagent

## Getting Started

### Starting the development environment

After cloning this repository, run the following commands in a terminal.


```bash
npm ci
npm run tauri dev
```

The `tauri dev` script will ensure a Shadow CLJS watch is started. If you are
using Emacs, then you can `M-x cider-connect-cljs` and start coding!

## Source structure

The source code is organized exactly as any other Shadow CLJS project, but there
is an additional `src-tauri` folder. This folder contains Rust code.

## Producing a release build

First ensure `tauri.bundle.identifier` in `src-tauri/tauri.conf.json` contains a
value other than `com.tauri.dev`. Otherwise the build will fail, since this
value is expected to be unique.

After you have changed this value, you can simply run the following command.

```bash
npm run tauri build
```

If you use Mac, then this process produces a disk image with a release build of
the app inside.

## Caveats

### Reagent and React 18

Reagent has *experimental* React 18 support. If you would like to fully embrace
modern React, consider using the [helix](https://github.com/lilactown/helix) library.

This template in the future may migrate to Helix, so that newcomers can
immediately start enjoying a modern React wrapper without compromises.

## Learning more

To learn more about ClojureScript, check out the official [Quick Start guide](https://clojurescript.org/guides/quick-start).

To learn more about Tauri, see the official [Tauri v1 Guide](https://tauri.app/v1/guides/).

</details>
