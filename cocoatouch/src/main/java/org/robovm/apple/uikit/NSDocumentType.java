/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDocumentType/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(NSDocumentType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSDocumentType PlainText = new NSDocumentType("PlainValue");
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSDocumentType RTF = new NSDocumentType("RTFValue");
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSDocumentType RTFD = new NSDocumentType("RTFDValue");
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSDocumentType HTML = new NSDocumentType("HTMLValue");
    private static NSDocumentType[] values = new NSDocumentType[] {PlainText, RTF, RTFD, HTML};
    private final LazyGlobalValue<NSString> lazyGlobalValue;
    
    private NSDocumentType(String getterName) {
        lazyGlobalValue = new LazyGlobalValue<>(getClass(), getterName);
    }
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public NSString value() {
        return lazyGlobalValue.value();
    }
    
    public static NSDocumentType valueOf(NSString value) {
        for (NSDocumentType v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSDocumentType/*</name>*/.class.getName());
    }
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSPlainTextDocumentType", optional=true)
    protected static native NSString PlainValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSRTFTextDocumentType", optional=true)
    protected static native NSString RTFValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSRTFDTextDocumentType", optional=true)
    protected static native NSString RTFDValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSHTMLTextDocumentType", optional=true)
    protected static native NSString HTMLValue();
    /*</methods>*/
}
