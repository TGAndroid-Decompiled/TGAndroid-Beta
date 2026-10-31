package th;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ax;
import org.telegram.messenger.ef;
import org.telegram.messenger.pz;
import org.telegram.messenger.qz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mg;
public final class x1 implements ai {
    public final z2 f49596a;

    public x1(z2 z2Var) {
        this.f49596a = z2Var;
    }

    @Override
    public final void C(mg mgVar) {
        zs.f(this.f49596a.f49730l2).d(mgVar);
    }

    @Override
    public final boolean D() {
        return this.f49596a.L0();
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
        z2 z2Var = this.f49596a;
        if (z2Var.f49755s0.m0 && (storyItem = z2Var.f49776x1.f49661a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || z2Var.f49753r2.a2.getSelectedPhotos().isEmpty())) {
                ag.v vVar = z2Var.f49753r2;
                if (vVar != null) {
                    vVar.N(i10);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i10 != 8) {
                z2Var.f49753r2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = z2Var.f49753r2.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = z2Var.f49753r2.a2.getSelectedPhotosOrder();
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
                            ef efVar = (ef) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            ?? obj = new Object();
                            boolean z19 = efVar.f19507b;
                            if (!z19 && (str2 = efVar.h) != null) {
                                obj.f17515c = str2;
                            } else {
                                String str3 = efVar.I;
                                if (str3 != null) {
                                    obj.f17515c = str3;
                                }
                            }
                            obj.e = efVar.f19508c;
                            obj.f17516f = efVar.f19510g;
                            obj.f17524o = z19;
                            CharSequence charSequence = efVar.f19506a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f17518i = efVar.f19516n;
                            obj.f17519j = efVar.f19520r;
                            obj.h = efVar.f19525x;
                            obj.f17520k = efVar.f19521s;
                            obj.f17527r = efVar.L;
                            obj.f17529t = qz.h(efVar.f19506a);
                            obj.f17530u = efVar.M;
                            arrayList.add(obj);
                            efVar.e();
                        }
                    }
                    if (i14 == 0) {
                        z15 = ((pz) arrayList.get(i13)).f17529t;
                    } else {
                        z15 = i13;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = z2Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i18 = i13;
                    long j12 = z2Var.f49726k1;
                    if (i10 != 4 && !z13) {
                        z16 = true;
                        z17 = i18;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    qz.X(accountInstance, arrayList, j12, null, null, storyItem, null, z17, z10, null, null, z11, i11, i12, z15, null, null, 0L, false, 0L, z2Var.K1.getSendMonoForumPeerId(), z2Var.K1.getSendMessageSuggestionParams(), null, false);
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
        z2 z2Var = this.f49596a;
        TL_stories.StoryItem storyItem = z2Var.f49776x1.f49661a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = z2Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j12 = z2Var.f49726k1;
            org.telegram.messenger.r5 r5Var = qz.I;
            new Thread(new ax(null, arrayList, j12, accountInstance, charSequence2, false, null, null, null, null, z10, i10, i11, storyItem, null, j10, z11, j11, null)).start();
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
        this.f49596a.K1.L();
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
