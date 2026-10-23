package zf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final pb.a f51582a;
    public ContentHandler f51583b;
    public Editable f51584c;
    public final ArrayDeque d = new ArrayDeque();

    public j(pb.a aVar) {
        this.f51582a = aVar;
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
        this.f51583b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f51583b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f51583b.endElement(str, str2, str3);
        }
        Editable editable = this.f51584c;
        this.f51582a.getClass();
        pb.a.m0(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f51583b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f51583b == null) {
            this.f51584c = editable;
            this.f51583b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f51583b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f51583b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f51583b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f51583b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f51583b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f51584c;
        this.f51582a.getClass();
        boolean m0 = pb.a.m0(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(m0));
        if (!m0) {
            this.f51583b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f51583b.startPrefixMapping(str, str2);
    }
}
