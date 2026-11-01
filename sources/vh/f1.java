package vh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.yy;
public final class f1 extends yy {
    public final qu0 X;
    public final g1 Y;

    public f1(g1 g1Var) {
        super(100, true);
        this.Y = g1Var;
        this.X = new Object();
        this.O = new jg.h1(this, 16);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final qu0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w9;
        int i11;
        int i12;
        qu0 qu0Var = this.X;
        qu0Var.f29810c = false;
        Object F = this.Y.f51200c.F(i10);
        if (F instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) F;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    if (webDocument2 != null) {
                        arrayList = webDocument2.attributes;
                    } else {
                        arrayList = null;
                    }
                }
            }
        } else if (F instanceof TLRPC.Document) {
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        } else {
            qu0Var.f29810c = true;
            return qu0Var;
        }
        qu0Var.f29809b = 100.0f;
        qu0Var.f29808a = 100.0f;
        qu0Var.f29810c = false;
        if (document != null && (w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false)) != null && (i11 = w9.f19819w) != 0 && (i12 = w9.h) != 0) {
            qu0Var.f29808a = i11;
            qu0Var.f29809b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.f29808a = documentAttribute.f19801w;
                    qu0Var.f29809b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }
}
