package rf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class i implements Html.TagHandler, ContentHandler {
    public final oa.d f46550a;
    public ContentHandler f46551b;
    public Editable f46552c;
    public final ArrayDeque d = new ArrayDeque();

    public i(oa.d dVar) {
        this.f46550a = dVar;
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
        this.f46551b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f46551b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f46551b.endElement(str, str2, str3);
        }
        Editable editable = this.f46552c;
        this.f46550a.getClass();
        oa.d.C4(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f46551b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f46551b == null) {
            this.f46552c = editable;
            this.f46551b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f46551b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f46551b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f46551b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f46551b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f46551b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f46552c;
        this.f46550a.getClass();
        boolean C4 = oa.d.C4(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(C4));
        if (!C4) {
            this.f46551b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f46551b.startPrefixMapping(str, str2);
    }
}
