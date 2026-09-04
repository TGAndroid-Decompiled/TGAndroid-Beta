package yf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final t7.u f50109a;
    public ContentHandler f50110b;
    public Editable f50111c;
    public final ArrayDeque d = new ArrayDeque();

    public j(t7.u uVar) {
        this.f50109a = uVar;
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(attributes.getLocalName(i10))) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    @Override
    public final void characters(char[] cArr, int i10, int i11) {
        this.f50110b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f50110b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f50110b.endElement(str, str2, str3);
        }
        Editable editable = this.f50111c;
        this.f50109a.getClass();
        t7.u.w3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f50110b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f50110b == null) {
            this.f50111c = editable;
            this.f50110b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f50110b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f50110b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f50110b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f50110b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f50110b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f50111c;
        this.f50109a.getClass();
        boolean w32 = t7.u.w3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(w32));
        if (!w32) {
            this.f50110b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f50110b.startPrefixMapping(str, str2);
    }
}
