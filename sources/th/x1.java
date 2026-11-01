package th;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.bx;
import org.telegram.messenger.ff;
import org.telegram.messenger.qz;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mg;
public final class x1 implements ai {
    public final z2 f49610a;

    public x1(z2 z2Var) {
        this.f49610a = z2Var;
    }

    @Override
    public final void C(mg mgVar) {
        at.f(this.f49610a.f49744l2).d(mgVar);
    }

    @Override
    public final boolean D() {
        return this.f49610a.L0();
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        org.telegram.messenger.c accountInstance;
        boolean z16;
        boolean z17;
        String str;
        String str2;
        z2 z2Var = this.f49610a;
        if (z2Var.f49769s0.m0 && (storyItem = z2Var.f49790x1.f49675a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || z2Var.f49767r2.a2.getSelectedPhotos().isEmpty())) {
                ag.v vVar = z2Var.f49767r2;
                if (vVar != null) {
                    vVar.M(i10);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i10 != 8) {
                z2Var.f49767r2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = z2Var.f49767r2.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = z2Var.f49767r2.a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = i13; i16 < min; i16++) {
                        int i17 = i15 + i16;
                        if (i17 < selectedPhotosOrder.size()) {
                            ff ffVar = (ff) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            ?? obj = new Object();
                            boolean z19 = ffVar.f14603b;
                            if (!z19 && (str2 = ffVar.h) != null) {
                                obj.f17850c = str2;
                            } else {
                                String str3 = ffVar.I;
                                if (str3 != null) {
                                    obj.f17850c = str3;
                                }
                            }
                            obj.e = ffVar.f14604c;
                            obj.f17851f = ffVar.f14606g;
                            obj.f17859o = z19;
                            CharSequence charSequence = ffVar.f14602a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f17853i = ffVar.f14612n;
                            obj.f17854j = ffVar.f14616r;
                            obj.h = ffVar.f14621x;
                            obj.f17855k = ffVar.f14617s;
                            obj.f17862r = ffVar.L;
                            obj.f17864t = rz.h(ffVar.f14602a);
                            obj.f17865u = ffVar.M;
                            arrayList.add(obj);
                            ffVar.e();
                        }
                    }
                    if (i14 == 0) {
                        z15 = ((qz) arrayList.get(i13)).f17864t;
                    } else {
                        z15 = i13;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = z2Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i18 = i13;
                    long j12 = z2Var.f49740k1;
                    if (i10 != 4 && !z13) {
                        z16 = true;
                        z17 = i18;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    rz.X(accountInstance, arrayList, j12, null, null, storyItem, null, z17, z10, null, null, z11, i11, i12, z15, null, null, 0L, false, 0L, z2Var.K1.getSendMonoForumPeerId(), z2Var.K1.getSendMessageSuggestionParams(), null, false);
                    i14++;
                    z18 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = i18;
                }
                boolean z20 = z18;
                int i19 = i13;
                z2Var.K1.setFieldText("");
                if (j11 <= 0) {
                    z14 = z20;
                } else {
                    z14 = i19;
                }
                z2Var.i0(z14);
            }
        }
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        CharSequence charSequence2;
        boolean z12;
        z2 z2Var = this.f49610a;
        TL_stories.StoryItem storyItem = z2Var.f49790x1.f49675a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = z2Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j12 = z2Var.f49740k1;
            org.telegram.messenger.r5 r5Var = rz.I;
            new Thread(new bx(null, arrayList, j12, accountInstance, charSequence2, false, null, null, null, null, z10, i10, i11, storyItem, null, j10, z11, j11, null)).start();
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z2Var.i0(z12);
        }
    }

    @Override
    public final void j0() {
        this.f49610a.K1.K();
    }

    @Override
    public final void n0(Object obj) {
    }

    @Override
    public final void v0(TLRPC.User user) {
    }

    @Override
    public final void N() {
    }
}
