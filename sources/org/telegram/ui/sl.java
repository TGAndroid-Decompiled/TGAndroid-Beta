package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sl extends oq0 {
    public final ArrayList f52068a;
    public final int[] f52069b = new int[2];
    public final bn f52070c;

    public sl(bn bnVar, ArrayList arrayList) {
        this.f52070c = bnVar;
        this.f52068a = arrayList;
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.fv fvVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        sl slVar = this;
        bn bnVar = slVar.f52070c;
        if (bnVar.A0 != null && i7 >= 0) {
            ArrayList arrayList = slVar.f52068a;
            if (i7 >= arrayList.size()) {
                return null;
            }
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i7);
            int childCount = bnVar.A0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = bnVar.A0.getChildAt(i10);
                boolean z12 = childAt instanceof org.telegram.ui.Cells.r1;
                int[] iArr = slVar.f52069b;
                if (z12 && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && (fvVar = messageObject.f24270y2) != null) {
                    int[] iArr2 = new int[2];
                    ArrayList arrayList2 = fvVar.f23981g;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            org.telegram.messenger.au auVar = (org.telegram.messenger.au) arrayList2.get(i11);
                            if (auVar instanceof org.telegram.messenger.nu) {
                                org.telegram.messenger.nu nuVar = (org.telegram.messenger.nu) auVar;
                                pageBlock = nuVar.f26038r0;
                                imageReceiver2 = nuVar.Y;
                            } else if (auVar instanceof org.telegram.messenger.zu) {
                                org.telegram.messenger.zu zuVar = (org.telegram.messenger.zu) auVar;
                                TL_iv.pageBlockVideo pageblockvideo = zuVar.f28377r0;
                                imageReceiver2 = zuVar.Y;
                                pageBlock = pageblockvideo;
                            } else if (auVar instanceof org.telegram.messenger.fu) {
                                ArrayList arrayList3 = ((org.telegram.messenger.fu) auVar).Y;
                                int size = arrayList3.size();
                                c10 = 0;
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList3.get(i12);
                                    i12++;
                                    c11 = 1;
                                    org.telegram.messenger.tt ttVar = (org.telegram.messenger.tt) obj;
                                    if (ttVar.f27077b == pageBlock2) {
                                        Rect rect = auVar.f22969b;
                                        iArr2[0] = rect.left;
                                        iArr2[1] = auVar.U + rect.top;
                                        imageReceiver = ttVar.f27078c;
                                        break;
                                    }
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                c11 = 1;
                                if (auVar instanceof org.telegram.messenger.ru) {
                                    org.telegram.messenger.ru ruVar = (org.telegram.messenger.ru) auVar;
                                    ArrayList arrayList4 = ruVar.Y;
                                    int i13 = ruVar.f26666b0;
                                    if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.tt) arrayList4.get(i13)).f27077b == pageBlock2) {
                                        Rect rect2 = auVar.f22969b;
                                        iArr2[0] = rect2.left;
                                        iArr2[1] = auVar.U + rect2.top;
                                        imageReceiver = ((org.telegram.messenger.tt) arrayList4.get(i13)).f27078c;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    pageBlock = null;
                                    imageReceiver2 = null;
                                    if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                        Rect rect3 = auVar.f22969b;
                                        iArr2[c10] = rect3.left;
                                        iArr2[c11] = auVar.U + rect3.top;
                                        imageReceiver = imageReceiver2;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            c10 = 0;
                            c11 = 1;
                            if (pageBlock == pageBlock2) {
                                Rect rect32 = auVar.f22969b;
                                iArr2[c10] = rect32.left;
                                iArr2[c11] = auVar.U + rect32.top;
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
                    wq0Var.f53498b = iArr[c10];
                    wq0Var.f53499c = iArr[c11];
                    wq0Var.d = bnVar.A0;
                    wq0Var.f53497a = imageReceiver;
                    wq0Var.f53500e = imageReceiver.p();
                    wq0Var.h = imageReceiver.E();
                    wq0Var.f53504j = (int) ((bnVar.P9 - bnVar.R9) - org.telegram.messenger.g0.L(4.0f));
                    wq0Var.f53503i = (int) (bnVar.t9(org.telegram.ui.Components.w11.f41626c) + bnVar.f46236w.d() + org.telegram.messenger.g0.L(9.0f) + bnVar.Ya + bnVar.f45963ad);
                    return wq0Var;
                }
            }
            return null;
        }
        return null;
    }
}
