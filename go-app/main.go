package main

import (
    "fmt"
    "golang.org/x/text/language"
)

func main() {
    fmt.Println("Vulnerable Go app running")

    // Use vulnerable package
    tag := language.MustParse("en-US")
    fmt.Printf("Language tag: %v\n", tag)

    fmt.Println("App completed")
}