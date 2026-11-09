package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class tl extends pq0 {
    public final ArrayList f50196a;
    public final int[] f50197b = new int[2];
    public final cn f50198c;

    public tl(cn cnVar, ArrayList arrayList) {
        this.f50198c = cnVar;
        this.f50196a = arrayList;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.kv kvVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        tl tlVar = this;
        cn cnVar = tlVar.f50198c;
        if (cnVar.f44700z0 != null && i7 >= 0) {
            ArrayList arrayList = tlVar.f50196a;
            if (i7 >= arrayList.size()) {
                return null;
            }
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i7);
            int childCount = cnVar.f44700z0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = cnVar.f44700z0.getChildAt(i10);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.q1;
                int[] iArr = tlVar.f50197b;
                if (z11 && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && (kvVar = messageObject.f23309w2) != null) {
                    int[] iArr2 = new int[2];
                    ArrayList arrayList2 = kvVar.f23768g;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            org.telegram.messenger.fu fuVar = (org.telegram.messenger.fu) arrayList2.get(i11);
                            if (fuVar instanceof org.telegram.messenger.su) {
                                org.telegram.messenger.su suVar = (org.telegram.messenger.su) fuVar;
                                pageBlock = suVar.f25522q0;
                                imageReceiver2 = suVar.X;
                            } else if (fuVar instanceof org.telegram.messenger.ev) {
                                org.telegram.messenger.ev evVar = (org.telegram.messenger.ev) fuVar;
                                TL_iv.pageBlockVideo pageblockvideo = evVar.f22278q0;
                                imageReceiver2 = evVar.X;
                                pageBlock = pageblockvideo;
                            } else if (fuVar instanceof org.telegram.messenger.ku) {
                                ArrayList arrayList3 = ((org.telegram.messenger.ku) fuVar).X;
                                int size = arrayList3.size();
                                c10 = 0;
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList3.get(i12);
                                    i12++;
                                    c11 = 1;
                                    org.telegram.messenger.yt ytVar = (org.telegram.messenger.yt) obj;
                                    if (ytVar.f26736b == pageBlock2) {
                                        Rect rect = fuVar.f22470b;
                                        iArr2[0] = rect.left;
                                        iArr2[1] = fuVar.T + rect.top;
                                        imageReceiver = ytVar.f26737c;
                                        break;
                                    }
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                c11 = 1;
                                if (fuVar instanceof org.telegram.messenger.wu) {
                                    org.telegram.messenger.wu wuVar = (org.telegram.messenger.wu) fuVar;
                                    ArrayList arrayList4 = wuVar.X;
                                    int i13 = wuVar.f26377a0;
                                    if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.yt) arrayList4.get(i13)).f26736b == pageBlock2) {
                                        Rect rect2 = fuVar.f22470b;
                                        iArr2[0] = rect2.left;
                                        iArr2[1] = fuVar.T + rect2.top;
                                        imageReceiver = ((org.telegram.messenger.yt) arrayList4.get(i13)).f26737c;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    pageBlock = null;
                                    imageReceiver2 = null;
                                    if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                        Rect rect3 = fuVar.f22470b;
                                        iArr2[c10] = rect3.left;
                                        iArr2[c11] = fuVar.T + rect3.top;
                                        imageReceiver = imageReceiver2;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            c10 = 0;
                            c11 = 1;
                            if (pageBlock == pageBlock2) {
                                Rect rect32 = fuVar.f22470b;
                                iArr2[c10] = rect32.left;
                                iArr2[c11] = fuVar.T + rect32.top;
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
                        iArr[c10] = q1Var.getTextX() + iArr2[c10] + iArr[c10];
                        iArr[c11] = q1Var.getTextY() + iArr2[c11] + iArr[c11];
                    }
                } else {
                    c10 = 0;
                    c11 = 1;
                    imageReceiver = null;
                }
                if (imageReceiver == null) {
                    i10++;
                    tlVar = this;
                } else {
                    yq0 yq0Var = new yq0();
                    yq0Var.f52160b = iArr[c10];
                    yq0Var.f52161c = iArr[c11];
                    yq0Var.d = cnVar.f44700z0;
                    yq0Var.f52159a = imageReceiver;
                    yq0Var.f52162e = imageReceiver.p();
                    yq0Var.h = imageReceiver.E();
                    yq0Var.f52166j = (int) ((cnVar.N9 - cnVar.P9) - org.telegram.messenger.g0.L(4.0f));
                    yq0Var.f52165i = (int) (cnVar.s9(org.telegram.ui.Components.j11.f34908c) + cnVar.f44661w.d() + org.telegram.messenger.g0.L(9.0f) + cnVar.Wa + cnVar.Yc);
                    return yq0Var;
                }
            }
            return null;
        }
        return null;
    }
}
