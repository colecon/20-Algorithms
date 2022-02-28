# 20-Algorithms
20 Algorithms with input/output explanations




# Widget Detection Bookmarklet

<a href="javascript:(function(){
    const scripts = document.getElementsByTagName('script');
    const divs = document.getElementsByTagName('div');
    let foundScript = false;
    let foundDiv = false;
    for (let i = 0; i < scripts.length; i++) {
      const regexPattern = /.*civicscience(dev)?.com/;
      if (regexPattern.test(scripts[i].src)) {
        foundScript = scripts[i];
        break;
      }
    }
    for (let i = 0; i < divs.length; i++) {
      if (divs[i].hasAttribute('data-civicscience-widget')) {
        foundDiv = divs[i];
        break;
      }
    }
    if (foundDiv !== false) {
      foundDiv.style.border = 'dodgerblue dashed 5px';
      foundDiv.scrollIntoView();
    }
    const scriptMsg =
      foundScript !== false
        ? 'The script to our integration code has been found. '
        : 'The script to our integration code is not present. ';
    const divMsg =
      foundDiv !== false
        ? 'The widget has been found and outlined in a dashed blue border. You will be navigated to the widget following this message.'
        : 'The widget has not been found.';
    window.alert(scriptMsg + divMsg);
  })();">Widget Detection</a>

The bookmarklet can be used to search a webpage for the use of our widget.

Drag and drop this link into your browser bookmarks tab. While visiting another web page, select the bookmark, and it will run a search for the use of our widget. An alert will pop up indicating whether it was found or not. Following the alert, you will be navigated to the widget with a dashed blue border.

If the widget is held within an iframe, it will not be found due to the 
<a href="https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy">Same-origin policy</a>.



