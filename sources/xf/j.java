package xf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final qb.b f45149a;
    public ContentHandler f45150b;
    public Editable f45151c;
    public final ArrayDeque d = new ArrayDeque();

    public j(qb.b bVar) {
        this.f45149a = bVar;
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
        this.f45150b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f45150b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f45150b.endElement(str, str2, str3);
        }
        Editable editable = this.f45151c;
        this.f45149a.getClass();
        qb.b.M3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f45150b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f45150b == null) {
            this.f45151c = editable;
            this.f45150b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f45150b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f45150b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f45150b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f45150b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f45150b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f45151c;
        this.f45149a.getClass();
        boolean M3 = qb.b.M3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(M3));
        if (!M3) {
            this.f45150b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f45150b.startPrefixMapping(str, str2);
    }
}
