package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sl extends oq0 {
    public final ArrayList f52101a;
    public final int[] f52102b = new int[2];
    public final bn f52103c;

    public sl(bn bnVar, ArrayList arrayList) {
        this.f52103c = bnVar;
        this.f52101a = arrayList;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.messenger.ev evVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        sl slVar = this;
        bn bnVar = slVar.f52103c;
        if (bnVar.A0 != null && i7 >= 0) {
            ArrayList arrayList = slVar.f52101a;
            if (i7 >= arrayList.size()) {
                return null;
            }
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i7);
            int childCount = bnVar.A0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = bnVar.A0.getChildAt(i10);
                boolean z12 = childAt instanceof org.telegram.ui.Cells.r1;
                int[] iArr = slVar.f52102b;
                if (z12 && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && (evVar = messageObject.f24130y2) != null) {
                    int[] iArr2 = new int[2];
                    ArrayList arrayList2 = evVar.f23877g;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            org.telegram.messenger.zt ztVar = (org.telegram.messenger.zt) arrayList2.get(i11);
                            if (ztVar instanceof org.telegram.messenger.mu) {
                                org.telegram.messenger.mu muVar = (org.telegram.messenger.mu) ztVar;
                                pageBlock = muVar.f25934r0;
                                imageReceiver2 = muVar.Y;
                            } else if (ztVar instanceof org.telegram.messenger.yu) {
                                org.telegram.messenger.yu yuVar = (org.telegram.messenger.yu) ztVar;
                                TL_iv.pageBlockVideo pageblockvideo = yuVar.f28281r0;
                                imageReceiver2 = yuVar.Y;
                                pageBlock = pageblockvideo;
                            } else if (ztVar instanceof org.telegram.messenger.eu) {
                                ArrayList arrayList3 = ((org.telegram.messenger.eu) ztVar).Y;
                                int size = arrayList3.size();
                                c10 = 0;
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList3.get(i12);
                                    i12++;
                                    c11 = 1;
                                    org.telegram.messenger.st stVar = (org.telegram.messenger.st) obj;
                                    if (stVar.f26950b == pageBlock2) {
                                        Rect rect = ztVar.f28442b;
                                        iArr2[0] = rect.left;
                                        iArr2[1] = ztVar.U + rect.top;
                                        imageReceiver = stVar.f26951c;
                                        break;
                                    }
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                c11 = 1;
                                if (ztVar instanceof org.telegram.messenger.qu) {
                                    org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) ztVar;
                                    ArrayList arrayList4 = quVar.Y;
                                    int i13 = quVar.f26567b0;
                                    if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.st) arrayList4.get(i13)).f26950b == pageBlock2) {
                                        Rect rect2 = ztVar.f28442b;
                                        iArr2[0] = rect2.left;
                                        iArr2[1] = ztVar.U + rect2.top;
                                        imageReceiver = ((org.telegram.messenger.st) arrayList4.get(i13)).f26951c;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    pageBlock = null;
                                    imageReceiver2 = null;
                                    if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                        Rect rect3 = ztVar.f28442b;
                                        iArr2[c10] = rect3.left;
                                        iArr2[c11] = ztVar.U + rect3.top;
                                        imageReceiver = imageReceiver2;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            c10 = 0;
                            c11 = 1;
                            if (pageBlock == pageBlock2) {
                                Rect rect32 = ztVar.f28442b;
                                iArr2[c10] = rect32.left;
                                iArr2[c11] = ztVar.U + rect32.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            continue;
                            i11++;
                        } else {
                            c10 = 0;
                            c11 = 1;
                            imageReceiver = null;
                            break;
                        }
                    }
                    if (imageReceiver != null) {
                        childAt.getLocationInWindow(iArr);
                        iArr[c10] = r1Var.getTextX() + iArr2[c10] + iArr[c10];
                        iArr[c11] = r1Var.getTextY() + iArr2[c11] + iArr[c11];
                    }
                } else {
                    c10 = 0;
                    c11 = 1;
                    imageReceiver = null;
                }
                if (imageReceiver == null) {
                    i10++;
                    slVar = this;
                } else {
                    wq0 wq0Var = new wq0();
                    wq0Var.f53727b = iArr[c10];
                    wq0Var.f53728c = iArr[c11];
                    wq0Var.d = bnVar.A0;
                    wq0Var.f53726a = imageReceiver;
                    wq0Var.f53729e = imageReceiver.p();
                    wq0Var.h = imageReceiver.F();
                    wq0Var.f53733j = (int) ((bnVar.P9 - bnVar.R9) - org.telegram.messenger.g0.L(4.0f));
                    wq0Var.f53732i = (int) (bnVar.t9(org.telegram.ui.Components.v11.f40539c) + bnVar.f46404w.d() + org.telegram.messenger.g0.L(9.0f) + bnVar.Ya + bnVar.f46131ad);
                    return wq0Var;
                }
            }
            return null;
        }
        return null;
    }
}
