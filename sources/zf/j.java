package zf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class j implements Html.TagHandler, ContentHandler {
    public final pb.a f52044a;
    public ContentHandler f52045b;
    public Editable f52046c;
    public final ArrayDeque d = new ArrayDeque();

    public j(pb.a aVar) {
        this.f52044a = aVar;
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
        this.f52045b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f52045b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f52045b.endElement(str, str2, str3);
        }
        Editable editable = this.f52046c;
        this.f52044a.getClass();
        pb.a.m0(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f52045b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f52045b == null) {
            this.f52046c = editable;
            this.f52045b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f52045b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f52045b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f52045b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f52045b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f52045b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f52046c;
        this.f52044a.getClass();
        boolean m0 = pb.a.m0(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(m0));
        if (!m0) {
            this.f52045b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f52045b.startPrefixMapping(str, str2);
    }
}
