package yf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final t7.u f50138a;
    public ContentHandler f50139b;
    public Editable f50140c;
    public final ArrayDeque d = new ArrayDeque();

    public j(t7.u uVar) {
        this.f50138a = uVar;
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
        this.f50139b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f50139b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f50139b.endElement(str, str2, str3);
        }
        Editable editable = this.f50140c;
        this.f50138a.getClass();
        t7.u.w3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f50139b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f50139b == null) {
            this.f50140c = editable;
            this.f50139b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f50139b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f50139b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f50139b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f50139b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f50139b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f50140c;
        this.f50138a.getClass();
        boolean w32 = t7.u.w3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(w32));
        if (!w32) {
            this.f50139b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f50139b.startPrefixMapping(str, str2);
    }
}
