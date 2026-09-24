package yf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final rb.a f47103a;
    public ContentHandler f47104b;
    public Editable f47105c;
    public final ArrayDeque d = new ArrayDeque();

    public j(rb.a aVar) {
        this.f47103a = aVar;
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
        this.f47104b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f47104b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f47104b.endElement(str, str2, str3);
        }
        Editable editable = this.f47105c;
        this.f47103a.getClass();
        rb.a.r3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f47104b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f47104b == null) {
            this.f47105c = editable;
            this.f47104b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f47104b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f47104b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f47104b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f47104b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f47104b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f47105c;
        this.f47103a.getClass();
        boolean r32 = rb.a.r3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(r32));
        if (!r32) {
            this.f47104b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f47104b.startPrefixMapping(str, str2);
    }
}
