package qh;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pz;
public final class h1 extends pz {
    public final kv0 X;
    public final i1 Y;

    public h1(i1 i1Var) {
        super(100, true);
        this.Y = i1Var;
        this.X = new Object();
        this.O = new lh.n5(this, 7);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final kv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        kv0 kv0Var = this.X;
        kv0Var.f28465c = false;
        Object F = this.Y.f45402c.F(i10);
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
            kv0Var.f28465c = true;
            return kv0Var;
        }
        kv0Var.f28464b = 100.0f;
        kv0Var.f28463a = 100.0f;
        kv0Var.f28465c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20868w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            kv0Var.f28463a = i11;
            kv0Var.f28464b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    kv0Var.f28463a = documentAttribute.f20850w;
                    kv0Var.f28464b = documentAttribute.h;
                    break;
                }
            }
        }
        return kv0Var;
    }
}
