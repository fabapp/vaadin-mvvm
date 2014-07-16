function de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset(){
  var $intern_0 = 'bootstrap', $intern_1 = 'begin', $intern_2 = 'gwt.codesvr.de.appblocks.vaadin.widgetset.Vaadin_mvvmWidgetset=', $intern_3 = 'gwt.codesvr=', $intern_4 = 'de.appblocks.vaadin.widgetset.Vaadin_mvvmWidgetset', $intern_5 = 'startup', $intern_6 = 'DUMMY', $intern_7 = 0, $intern_8 = 'body', $intern_9 = 'iframe', $intern_10 = 'javascript:""', $intern_11 = 'position:absolute; width:0; height:0; border:none; left: -1000px;', $intern_12 = ' top: -1000px;', $intern_13 = 'CSS1Compat', $intern_14 = '<!doctype html>', $intern_15 = '', $intern_16 = '<html><head><\/head><body><\/body><\/html>', $intern_17 = 'undefined', $intern_18 = /loaded|complete/, $intern_19 = 'DOMContentLoaded', $intern_20 = 50, $intern_21 = 'Chrome', $intern_22 = 'eval("', $intern_23 = 1, $intern_24 = '");', $intern_25 = 'script', $intern_26 = 'javascript', $intern_27 = 'moduleStartup', $intern_28 = 'moduleRequested', $intern_29 = 'head', $intern_30 = 'meta', $intern_31 = 'name', $intern_32 = 'de.appblocks.vaadin.widgetset.Vaadin_mvvmWidgetset::', $intern_33 = '::', $intern_34 = 'gwt:property', $intern_35 = 'content', $intern_36 = '=', $intern_37 = 'gwt:onPropertyErrorFn', $intern_38 = 'Bad handler "', $intern_39 = '" for "gwt:onPropertyErrorFn"', $intern_40 = 'gwt:onLoadErrorFn', $intern_41 = '" for "gwt:onLoadErrorFn"', $intern_42 = '#', $intern_43 = '?', $intern_44 = '/', $intern_45 = /^\w+:\/\//, $intern_46 = 'img', $intern_47 = 'clear.cache.gif', $intern_48 = 'baseUrl', $intern_49 = 'de.appblocks.vaadin.widgetset.Vaadin_mvvmWidgetset.nocache.js', $intern_50 = 'base', $intern_51 = '//', $intern_52 = /^\//, $intern_53 = /^[a-zA-Z]+:\/\//, $intern_54 = 'modernie', $intern_55 = 'IE', $intern_56 = 'Trident', $intern_57 = 'yes', $intern_58 = 'none', $intern_59 = 'user.agent', $intern_60 = 'opera', $intern_61 = 'webkit', $intern_62 = 'safari', $intern_63 = 'msie', $intern_64 = 10, $intern_65 = 'ie10', $intern_66 = 9, $intern_67 = 'ie9', $intern_68 = 8, $intern_69 = 'ie8', $intern_70 = 'gecko', $intern_71 = 'gecko1_8', $intern_72 = 'unknown', $intern_73 = 2, $intern_74 = 3, $intern_75 = 4, $intern_76 = 5, $intern_77 = 'selectingPermutation', $intern_78 = 'de.appblocks.vaadin.widgetset.Vaadin_mvvmWidgetset.devmode.js', $intern_79 = '359EFAA631C2D081E0FE9C3AF607C6E2', $intern_80 = ':1', $intern_81 = ':2', $intern_82 = ':3', $intern_83 = ':4', $intern_84 = ':5', $intern_85 = ':6', $intern_86 = ':', $intern_87 = '.cache.js', $intern_88 = 'loadExternalRefs', $intern_89 = 'end', $intern_90 = 'http:', $intern_91 = 'file:', $intern_92 = '_gwt_dummy_', $intern_93 = '__gwtDevModeHook:de.appblocks.vaadin.widgetset.Vaadin_mvvmWidgetset', $intern_94 = /^http:\/\/(localhost|127\.0\.0\.1)(:\d+)?\/.*$/, $intern_95 = 'Ignoring non-whitelisted Dev Mode URL: ', $intern_96 = ':moduleBase';
  var $wnd = window;
  var $doc = document;
  sendStats($intern_0, $intern_1);
  function isHostedMode(){
    var query = $wnd.location.search;
    return query.indexOf($intern_2) != -1 || query.indexOf($intern_3) != -1;
  }

  function sendStats(evtGroupString, typeString){
    if ($wnd.__gwtStatsEvent) {
      $wnd.__gwtStatsEvent({moduleName:$intern_4, sessionId:$wnd.__gwtStatsSessionId, subSystem:$intern_5, evtGroup:evtGroupString, millis:(new Date).getTime(), type:typeString});
    }
  }

  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__sendStats = sendStats;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__moduleName = $intern_4;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__errFn = null;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__moduleBase = $intern_6;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__softPermutationId = $intern_7;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__computePropValue = null;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__getPropMap = null;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__gwtInstallCode = function(){
  }
  ;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__gwtStartLoadingFragment = function(){
    return null;
  }
  ;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__gwt_isKnownPropertyValue = function(){
    return false;
  }
  ;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__gwt_getMetaProperty = function(){
    return null;
  }
  ;
  __propertyErrorFunction = null;
  var activeModules = $wnd.__gwt_activeModules = $wnd.__gwt_activeModules || {};
  activeModules[$intern_4] = {moduleName:$intern_4};
  var frameDoc;
  function getInstallLocationDoc(){
    setupInstallLocation();
    return frameDoc;
  }

  function getInstallLocation(){
    setupInstallLocation();
    return frameDoc.getElementsByTagName($intern_8)[$intern_7];
  }

  function setupInstallLocation(){
    if (frameDoc) {
      return;
    }
    var scriptFrame = $doc.createElement($intern_9);
    scriptFrame.src = $intern_10;
    scriptFrame.id = $intern_4;
    scriptFrame.style.cssText = $intern_11 + $intern_12;
    scriptFrame.tabIndex = -1;
    $doc.body.appendChild(scriptFrame);
    frameDoc = scriptFrame.contentDocument;
    if (!frameDoc) {
      frameDoc = scriptFrame.contentWindow.document;
    }
    frameDoc.open();
    var doctype = document.compatMode == $intern_13?$intern_14:$intern_15;
    frameDoc.write(doctype + $intern_16);
    frameDoc.close();
  }

  function installScript(filename){
    function setupWaitForBodyLoad(callback){
      function isBodyLoaded(){
        if (typeof $doc.readyState == $intern_17) {
          return typeof $doc.body != $intern_17 && $doc.body != null;
        }
        return $intern_18.test($doc.readyState);
      }

      var bodyDone = isBodyLoaded();
      if (bodyDone) {
        callback();
        return;
      }
      function onBodyDone(){
        if (!bodyDone) {
          bodyDone = true;
          callback();
          if ($doc.removeEventListener) {
            $doc.removeEventListener($intern_19, onBodyDone, false);
          }
          if (onBodyDoneTimerId) {
            clearInterval(onBodyDoneTimerId);
          }
        }
      }

      if ($doc.addEventListener) {
        $doc.addEventListener($intern_19, onBodyDone, false);
      }
      var onBodyDoneTimerId = setInterval(function(){
        if (isBodyLoaded()) {
          onBodyDone();
        }
      }
      , $intern_20);
    }

    function installCode(code_0){
      function removeScript(body_0, element){
      }

      var docbody = getInstallLocation();
      var doc = getInstallLocationDoc();
      var script;
      if (navigator.userAgent.indexOf($intern_21) > -1 && window.JSON) {
        var scriptFrag = doc.createDocumentFragment();
        scriptFrag.appendChild(doc.createTextNode($intern_22));
        for (var i = $intern_7; i < code_0.length; i++) {
          var c = window.JSON.stringify(code_0[i]);
          scriptFrag.appendChild(doc.createTextNode(c.substring($intern_23, c.length - $intern_23)));
        }
        scriptFrag.appendChild(doc.createTextNode($intern_24));
        script = doc.createElement($intern_25);
        script.language = $intern_26;
        script.appendChild(scriptFrag);
        docbody.appendChild(script);
        removeScript(docbody, script);
      }
       else {
        for (var i = $intern_7; i < code_0.length; i++) {
          script = doc.createElement($intern_25);
          script.language = $intern_26;
          script.text = code_0[i];
          docbody.appendChild(script);
          removeScript(docbody, script);
        }
      }
    }

    de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.onScriptDownloaded = function(code_0){
      setupWaitForBodyLoad(function(){
        installCode(code_0);
      }
      );
    }
    ;
    sendStats($intern_27, $intern_28);
    var script = $doc.createElement($intern_25);
    script.src = filename;
    $doc.getElementsByTagName($intern_29)[$intern_7].appendChild(script);
  }

  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__startLoadingFragment = function(fragmentFile){
    return computeUrlForResource(fragmentFile);
  }
  ;
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__installRunAsyncCode = function(code_0){
    var docbody = getInstallLocation();
    var script = getInstallLocationDoc().createElement($intern_25);
    script.language = $intern_26;
    script.text = code_0;
    docbody.appendChild(script);
  }
  ;
  function processMetas(){
    var metaProps = {};
    var propertyErrorFunc;
    var onLoadErrorFunc;
    var metas = $doc.getElementsByTagName($intern_30);
    for (var i = $intern_7, n = metas.length; i < n; ++i) {
      var meta = metas[i], name_0 = meta.getAttribute($intern_31), content;
      if (name_0) {
        name_0 = name_0.replace($intern_32, $intern_15);
        if (name_0.indexOf($intern_33) >= $intern_7) {
          continue;
        }
        if (name_0 == $intern_34) {
          content = meta.getAttribute($intern_35);
          if (content) {
            var value_0, eq = content.indexOf($intern_36);
            if (eq >= $intern_7) {
              name_0 = content.substring($intern_7, eq);
              value_0 = content.substring(eq + $intern_23);
            }
             else {
              name_0 = content;
              value_0 = $intern_15;
            }
            metaProps[name_0] = value_0;
          }
        }
         else if (name_0 == $intern_37) {
          content = meta.getAttribute($intern_35);
          if (content) {
            try {
              propertyErrorFunc = eval(content);
            }
             catch (e) {
              alert($intern_38 + content + $intern_39);
            }
          }
        }
         else if (name_0 == $intern_40) {
          content = meta.getAttribute($intern_35);
          if (content) {
            try {
              onLoadErrorFunc = eval(content);
            }
             catch (e) {
              alert($intern_38 + content + $intern_41);
            }
          }
        }
      }
    }
    __gwt_getMetaProperty = function(name_0){
      var value_0 = metaProps[name_0];
      return value_0 == null?null:value_0;
    }
    ;
    __propertyErrorFunction = propertyErrorFunc;
    de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__errFn = onLoadErrorFunc;
  }

  function computeScriptBase(){
    function getDirectoryOfFile(path){
      var hashIndex = path.lastIndexOf($intern_42);
      if (hashIndex == -1) {
        hashIndex = path.length;
      }
      var queryIndex = path.indexOf($intern_43);
      if (queryIndex == -1) {
        queryIndex = path.length;
      }
      var slashIndex = path.lastIndexOf($intern_44, Math.min(queryIndex, hashIndex));
      return slashIndex >= $intern_7?path.substring($intern_7, slashIndex + $intern_23):$intern_15;
    }

    function ensureAbsoluteUrl(url_0){
      if (url_0.match($intern_45)) {
      }
       else {
        var img = $doc.createElement($intern_46);
        img.src = url_0 + $intern_47;
        url_0 = getDirectoryOfFile(img.src);
      }
      return url_0;
    }

    function tryMetaTag(){
      var metaVal = __gwt_getMetaProperty($intern_48);
      if (metaVal != null) {
        return metaVal;
      }
      return $intern_15;
    }

    function tryNocacheJsTag(){
      var scriptTags = $doc.getElementsByTagName($intern_25);
      for (var i = $intern_7; i < scriptTags.length; ++i) {
        if (scriptTags[i].src.indexOf($intern_49) != -1) {
          return getDirectoryOfFile(scriptTags[i].src);
        }
      }
      return $intern_15;
    }

    function tryBaseTag(){
      var baseElements = $doc.getElementsByTagName($intern_50);
      if (baseElements.length > $intern_7) {
        return baseElements[baseElements.length - $intern_23].href;
      }
      return $intern_15;
    }

    function isLocationOk(){
      var loc = $doc.location;
      return loc.href == loc.protocol + $intern_51 + loc.host + loc.pathname + loc.search + loc.hash;
    }

    var tempBase = tryMetaTag();
    if (tempBase == $intern_15) {
      tempBase = tryNocacheJsTag();
    }
    if (tempBase == $intern_15) {
      tempBase = tryBaseTag();
    }
    if (tempBase == $intern_15 && isLocationOk()) {
      tempBase = getDirectoryOfFile($doc.location.href);
    }
    tempBase = ensureAbsoluteUrl(tempBase);
    return tempBase;
  }

  function computeUrlForResource(resource){
    if (resource.match($intern_52)) {
      return resource;
    }
    if (resource.match($intern_53)) {
      return resource;
    }
    return de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__moduleBase + resource;
  }

  function getCompiledCodeFilename(){
    var answers = [];
    var softPermutationId = $intern_7;
    function unflattenKeylistIntoAnswers(propValArray, value_0){
      var answer = answers;
      for (var i = $intern_7, n = propValArray.length - $intern_23; i < n; ++i) {
        answer = answer[propValArray[i]] || (answer[propValArray[i]] = []);
      }
      answer[propValArray[n]] = value_0;
    }

    var values = [];
    var providers = [];
    function computePropValue(propName){
      var value_0 = providers[propName](), allowedValuesMap = values[propName];
      if (value_0 in allowedValuesMap) {
        return value_0;
      }
      var allowedValuesList = [];
      for (var k in allowedValuesMap) {
        allowedValuesList[allowedValuesMap[k]] = k;
      }
      if (__propertyErrorFunc) {
        __propertyErrorFunc(propName, allowedValuesList, value_0);
      }
      throw null;
    }

    providers[$intern_54] = function(){
      {
        var ua = $wnd.navigator.userAgent;
        if (ua.indexOf($intern_55) == -1 && ua.indexOf($intern_56) != -1) {
          return $intern_57;
        }
        return $intern_58;
      }
    }
    ;
    values[$intern_54] = {none:$intern_7, yes:$intern_23};
    providers[$intern_59] = function(){
      var ua = navigator.userAgent.toLowerCase();
      if (function(){
        return ua.indexOf($intern_60) != -1;
      }
      ())
        return $intern_60;
      if (function(){
        return ua.indexOf($intern_61) != -1;
      }
      ())
        return $intern_62;
      if (function(){
        return ua.indexOf($intern_63) != -1 && $doc.documentMode == $intern_64;
      }
      ())
        return $intern_65;
      if (function(){
        return ua.indexOf($intern_63) != -1 && $doc.documentMode >= $intern_66;
      }
      ())
        return $intern_67;
      if (function(){
        return ua.indexOf($intern_63) != -1 && $doc.documentMode >= $intern_68;
      }
      ())
        return $intern_69;
      if (function(){
        return ua.indexOf($intern_70) != -1;
      }
      ())
        return $intern_71;
      return $intern_72;
    }
    ;
    values[$intern_59] = {gecko1_8:$intern_7, ie10:$intern_23, ie8:$intern_73, ie9:$intern_74, opera:$intern_75, safari:$intern_76};
    __gwt_isKnownPropertyValue = function(propName, propValue){
      return propValue in values[propName];
    }
    ;
    de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__getPropMap = function(){
      var result = {};
      for (var key in values) {
        if (values.hasOwnProperty(key)) {
          result[key] = computePropValue(key);
        }
      }
      return result;
    }
    ;
    de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__computePropValue = computePropValue;
    $wnd.__gwt_activeModules[$intern_4].bindings = de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__getPropMap;
    sendStats($intern_0, $intern_77);
    if (isHostedMode()) {
      return computeUrlForResource($intern_78);
    }
    var strongName;
    try {
      unflattenKeylistIntoAnswers([$intern_58, $intern_71], $intern_79);
      unflattenKeylistIntoAnswers([$intern_57, $intern_71], $intern_79 + $intern_80);
      unflattenKeylistIntoAnswers([$intern_58, $intern_65], $intern_79 + $intern_81);
      unflattenKeylistIntoAnswers([$intern_58, $intern_69], $intern_79 + $intern_82);
      unflattenKeylistIntoAnswers([$intern_58, $intern_67], $intern_79 + $intern_83);
      unflattenKeylistIntoAnswers([$intern_58, $intern_60], $intern_79 + $intern_84);
      unflattenKeylistIntoAnswers([$intern_58, $intern_62], $intern_79 + $intern_85);
      strongName = answers[computePropValue($intern_54)][computePropValue($intern_59)];
      var idx = strongName.indexOf($intern_86);
      if (idx != -1) {
        softPermutationId = parseInt(strongName.substring(idx + $intern_23), $intern_64);
        strongName = strongName.substring($intern_7, idx);
      }
    }
     catch (e) {
    }
    de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__softPermutationId = softPermutationId;
    return computeUrlForResource(strongName + $intern_87);
  }

  function loadExternalStylesheets(){
    if (!$wnd.__gwt_stylesLoaded) {
      $wnd.__gwt_stylesLoaded = {};
    }
    sendStats($intern_88, $intern_1);
    sendStats($intern_88, $intern_89);
  }

  processMetas();
  de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__moduleBase = computeScriptBase();
  activeModules[$intern_4].moduleBase = de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.__moduleBase;
  var filename = getCompiledCodeFilename();
  if ($wnd) {
    var devModePermitted = !!($wnd.location.protocol == $intern_90 || $wnd.location.protocol == $intern_91);
    $wnd.__gwt_activeModules[$intern_4].canRedirect = devModePermitted;
    function supportsSessionStorage(){
      var key = $intern_92;
      try {
        $wnd.sessionStorage.setItem(key, key);
        $wnd.sessionStorage.removeItem(key);
        return true;
      }
       catch (e) {
        return false;
      }
    }

    if (devModePermitted && supportsSessionStorage()) {
      var devModeKey = $intern_93;
      var devModeUrl = $wnd.sessionStorage[devModeKey];
      if (!$intern_94.test(devModeUrl)) {
        if (devModeUrl && (window.console && console.log)) {
          console.log($intern_95 + devModeUrl);
        }
        devModeUrl = $intern_15;
      }
      if (devModeUrl && !$wnd[devModeKey]) {
        $wnd[devModeKey] = true;
        $wnd[devModeKey + $intern_96] = computeScriptBase();
        var devModeScript = $doc.createElement($intern_25);
        devModeScript.src = devModeUrl;
        var head = $doc.getElementsByTagName($intern_29)[$intern_7];
        head.insertBefore(devModeScript, head.firstElementChild || head.children[$intern_7]);
        return false;
      }
    }
  }
  loadExternalStylesheets();
  sendStats($intern_0, $intern_89);
  installScript(filename);
  return true;
}

de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset.succeeded = de_appblocks_vaadin_widgetset_Vaadin_mvvmWidgetset();
