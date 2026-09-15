package yf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final rb.a f46835a;
    public ContentHandler f46836b;
    public Editable f46837c;
    public final ArrayDeque d = new ArrayDeque();

    public j(rb.a aVar) {
        this.f46835a = aVar;
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
        this.f46836b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f46836b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f46836b.endElement(str, str2, str3);
        }
        Editable editable = this.f46837c;
        this.f46835a.getClass();
        rb.a.r3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f46836b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f46836b == null) {
            this.f46837c = editable;
            this.f46836b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f46836b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f46836b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f46836b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f46836b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f46836b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f46837c;
        this.f46835a.getClass();
        boolean r32 = rb.a.r3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(r32));
        if (!r32) {
            this.f46836b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f46836b.startPrefixMapping(str, str2);
    }
}
