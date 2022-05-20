# Ulysses Space Station Clojure Course

Available as a video course on [YouTube][stindrago-youtube] under the form of an adventure.

## About

In this course you are going to learn [Clojure][clojure-site] by doing, with a bit of storytelling.

Each lecture is an exercise that you have to complete. View it like the quest that the protagonist in the story has to finish to continue his journey.

To complete a lecture you have to read the instructions inside the _README.md_. The code goes in the _src/_ directory in the files that are already created for you with some starting code.

This course uses unit testing to verify the correctness of the exercise. Run `clj -X:test` after you completed the exercise's instructions and verify there are no errors before continuing the adventure.

For this course you need the _Java JDK_ _Clojure Tools_, _git_, your favorite editor and some snacks.

## Installing Clojure

Clojure provides command line tools that can be used to start a Clojure programs and the REPL. See the official [getting started][clojure-getting-started] documentation on how to install the tools on your machine.

## Editor

Install an editor if you are not already using one. See the [official recommendations][clojure-tools].

During this course I will be using [Doom Emacs][doom-emacs] an [Emacs][emacs] distribution that is fast and customizable, see the [installation instructions][doom-emacs-getting-started].

## Exercises

The exercise directory is structured like this:

```
hello-adam
├── HELP.md
├── HINTS.md
├── README.md
├── SOLUTION.md
├── deps.edn
├── src
│   └── hello_adam.clj
└── test
    └── hello_adam_test.clj
```

- _HELP.md_, if you need help running the tests.
- _HINTS.md_, if you get stuck on the exercise, but try and solve it without using those first.
- _README.md_, the story and the instructions to complete the exercise.
- _SOLUTION.md_, if you passed all the tests, try figuring out how this solution is different than yours.
- _deps.edn_, the configuration file for the [Clojure Tools][clojure-deps-and-cli].
- _src/_, the directory with the source files. Your code goes here.
- _test/_, the directory of the unit tests. Do not worry about it.

## Recommended Learning Resources

There are some great resources available to help you get started learning Clojure.

- [Learn Clojure](http://learn-clojure.com/)
- [Clojure Docs](https://clojuredocs.org/)
- [Brave Clojure](http://www.braveclojure.com/)
- [4Clojure](https://4clojure.oxal.org/)

# Inspirations & Credits

Initially these exercises were thought to be uploaded to the [Exercism][exercism-site] platform as a contribution, but since than my idea has changed. I wanted to have story along side the exercises so I decided to make a video course instead.

The project structure follows the [Exercism Style Guide][exercism-style-guide].

Maybe in the future I will try to upload them.

# License

© 2022 stindrago [Creative Commons BY-SA][cc-by-sa]

[stindrago-youtube]: https://www.youtube.com/channel/UCAEekFrLX504AZaXeqmE9Wg
[clojure-site]: https://clojure.org
[clojure-getting-started]: https://clojure.org/guides/getting_started
[clojure-tools]: https://clojure.org/community/tools
[doom-emacs]: https://github.com/doomemacs/doomemacs
[emacs]: https://www.gnu.org/software/emacs/
[doom-emacs-getting-started]: https://github.com/doomemacs/doomemacs/blob/master/docs/getting_started.org#install
[clojure-deps-and-cli]: https://clojure.org/guides/deps_and_cli
[cc-by-sa]: https://creativecommons.org/licenses/by-sa/4.0/
[exercism-site]: https://exercism.org/
[exercism-style-guide]: https://exercism.org/docs/building/tracks/concept-exercises
