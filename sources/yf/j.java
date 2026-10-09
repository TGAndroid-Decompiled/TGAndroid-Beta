package yf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final qb.b f52175a;
    public ContentHandler f52176b;
    public Editable f52177c;
    public final ArrayDeque d = new ArrayDeque();

    public j(qb.b bVar) {
        this.f52175a = bVar;
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
        this.f52176b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f52176b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f52176b.endElement(str, str2, str3);
        }
        Editable editable = this.f52177c;
        this.f52175a.getClass();
        qb.b.K3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f52176b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f52176b == null) {
            this.f52177c = editable;
            this.f52176b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f52176b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f52176b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f52176b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f52176b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f52176b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f52177c;
        this.f52175a.getClass();
        boolean K3 = qb.b.K3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(K3));
        if (!K3) {
            this.f52176b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f52176b.startPrefixMapping(str, str2);
    }
}
