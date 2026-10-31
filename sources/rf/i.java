package rf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class i implements Html.TagHandler, ContentHandler {
    public final oa.d f46539a;
    public ContentHandler f46540b;
    public Editable f46541c;
    public final ArrayDeque d = new ArrayDeque();

    public i(oa.d dVar) {
        this.f46539a = dVar;
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
        this.f46540b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f46540b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f46540b.endElement(str, str2, str3);
        }
        Editable editable = this.f46541c;
        this.f46539a.getClass();
        oa.d.C4(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f46540b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f46540b == null) {
            this.f46541c = editable;
            this.f46540b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f46540b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f46540b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f46540b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f46540b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f46540b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f46541c;
        this.f46539a.getClass();
        boolean C4 = oa.d.C4(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(C4));
        if (!C4) {
            this.f46540b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f46540b.startPrefixMapping(str, str2);
    }
}
