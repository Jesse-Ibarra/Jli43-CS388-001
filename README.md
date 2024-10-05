# Lab 3: NY Times Bestselling Books

Course Link: [CodePath Android Course](https://courses.codepath.org/courses/and102/unit/3#!labs)

Submitted by: **Jesse Ibarra**

**NY Times Bestselling Books** is an app designed to display the current bestselling books based on NY Times data.

Time spent: **8** hours spent in total 

## Application Features

### Required Features

The following **required** functionality is completed:

- [X] (2 pts) **Live data is loaded from the NY Times API.**
    - <img src='Assets/Requirement_1.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
    - <img src='Assets/Screenshot%202024-10-05%20115210.png' title='Video Walkthrough' width='' alt='Video Walkthrough' />
- [X] (4 pts) **Books are displayed using a RecyclerView.**
    - Displays book ranking, cover, title, author, and description.
    - Book cover images are downloaded using Glide.
    - <img src='Assets/Requirement_2.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

### Stretch Features

The following **stretch** functionality is implemented:

- [X] (4 pts) **Improved layout and styling to match the NY Times website.**
    - Includes a "buy" button that links to Amazon.
    - <img src='Assets/Requirement_3.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
## Notes

I had some trouble getting the JSON response to work as I have not used that before and it
was new to me. Filtering the data was not something I knew how to do but the Codepath 
instructions guided me.

## Resources

- [CodePath's AsyncHTTPClient library](https://guides.codepath.org/android/Using-CodePath-Async-Http-Client)
- [Displaying Images with Glide library](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library)
- [Parsing JSON responses to Models](https://guides.codepath.org/android/converting-json-to-models)
- [Parsing JSON with gson library](https://guides.codepath.org/android/Leveraging-the-Gson-Library#parsing-the-response)
- [Kotlin's Guide on Serialization](https://kotlinlang.org/docs/serialization.html)
- GIF created with [CloudConvert](https://cloudconvert.com/)

## License

```plaintext
    Copyright [2024] [Jesse Ibarra]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.