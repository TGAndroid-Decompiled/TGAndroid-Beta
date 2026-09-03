package ph;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nz;
public final class g1 extends nz {
    public final jv0 X;
    public final h1 Y;

    public g1(h1 h1Var) {
        super(100, true);
        this.Y = h1Var;
        this.X = new Object();
        this.O = new kh.m5(this, 7);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final jv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        jv0 jv0Var = this.X;
        jv0Var.f26064c = false;
        Object F = this.Y.f41736c.F(i10);
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
            jv0Var.f26064c = true;
            return jv0Var;
        }
        jv0Var.f26063b = 100.0f;
        jv0Var.f26062a = 100.0f;
        jv0Var.f26064c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f19184w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            jv0Var.f26062a = i11;
            jv0Var.f26063b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.f26062a = documentAttribute.f19166w;
                    jv0Var.f26063b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }
}
