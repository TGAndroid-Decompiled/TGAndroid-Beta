package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class sk implements org.telegram.ui.Components.bi {
    public final an f49775a;

    public sk(an anVar) {
        this.f49775a = anVar;
    }

    @Override
    public final void F0() {
        this.f49775a.Z.L();
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void Y0(TLRPC.User user) {
        String n10 = org.telegram.messenger.t10.n(user);
        an anVar = this.f49775a;
        if (anVar.Z != null && user != null && !TextUtils.isEmpty(n10)) {
            qj qjVar = anVar.Z;
            qjVar.setFieldText("@" + n10 + " ");
            anVar.Z.H0();
        }
    }

    @Override
    public final void c0(org.telegram.ui.Components.qg qgVar) {
        this.f49775a.w8(qgVar);
    }

    @Override
    public final boolean f0() {
        return this.f49775a.pa();
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var;
        HashMap<Object, Object> hashMap;
        boolean z13;
        int i12;
        int i13;
        char c10;
        boolean z14;
        char c11;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        boolean z17;
        String str2;
        TLRPC.Message message;
        an anVar = this.f49775a;
        if (anVar.getParentActivity() != null && (u2Var = anVar.X1) != null) {
            boolean z18 = u2Var.f33011x1;
            org.telegram.messenger.ij ijVar = u2Var.B3;
            anVar.F5 = ijVar;
            if (ijVar != null && (message = ijVar.f23262k) != null) {
                message.invert_media = z11;
            }
            if (i7 != 8 && i7 != 7 && (i7 != 4 || u2Var.f32932a2.getSelectedPhotos().isEmpty())) {
                di.u2 u2Var2 = anVar.X1;
                if (u2Var2 != null) {
                    u2Var2.L(i7);
                }
                anVar.Za(i7);
                return;
            }
            di.u2 u2Var3 = anVar.X1;
            if (u2Var3 != null && i7 != 8) {
                u2Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = anVar.X1.f32932a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = anVar.X1.f32932a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i14 = 0;
                while (i14 < ceil) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < min) {
                        int i17 = i15 + i16;
                        if (i17 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z16 = z18;
                        } else {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            ?? obj = new Object();
                            obj.f22511b = gfVar.h;
                            boolean d = gfVar.d();
                            obj.f22523p = d;
                            boolean z19 = gfVar.f26845b;
                            if (z18 && d) {
                                obj.f22523p = false;
                                z19 = false;
                            }
                            if (!z19 && (str2 = gfVar.h) != null) {
                                obj.f22512c = str2;
                                if (!z18 && gfVar.c()) {
                                    obj.f22531y = gfVar.clone();
                                }
                            } else {
                                String str3 = gfVar.I;
                                if (str3 != null) {
                                    obj.f22512c = str3;
                                }
                            }
                            obj.f22513e = gfVar.f26846c;
                            obj.f22514f = gfVar.f26849g;
                            obj.f22515g = gfVar.f26847e;
                            obj.f22522o = z19;
                            obj.f22524q = gfVar.j();
                            hashMap2 = selectedPhotos;
                            z16 = z18;
                            obj.f22532z = gfVar.f26854m;
                            obj.A = gfVar.P;
                            CharSequence charSequence = gfVar.f26844a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f22516i = gfVar.f26855n;
                            obj.f22517j = gfVar.f26859r;
                            obj.h = gfVar.f26864x;
                            obj.f22518k = gfVar.f26860s;
                            obj.f22525r = gfVar.L;
                            obj.f22527t = org.telegram.messenger.gz.h(gfVar.f26844a);
                            obj.f22528u = gfVar.M;
                            obj.f22529w = gfVar.N;
                            if (!z16 && gfVar.c()) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            obj.f22530x = z17;
                            arrayList2.add(obj);
                            gfVar.e();
                        }
                        i16++;
                        z18 = z16;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z20 = z18;
                    if (i14 == 0) {
                        anVar.B8(((org.telegram.messenger.fz) arrayList2.get(0)).d, ((org.telegram.messenger.fz) arrayList2.get(0)).f22516i);
                        z13 = ((org.telegram.messenger.fz) arrayList2.get(0)).f22527t;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.ij ijVar2 = anVar.F5;
                    if (ijVar2 != null && ijVar2.q5()) {
                        org.telegram.messenger.nj njVar = anVar.f44010w5;
                        if (njVar == null) {
                            njVar = org.telegram.messenger.nj.b(anVar.F5.f23262k.suggested_post);
                        }
                        org.telegram.messenger.nj njVar2 = njVar;
                        org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                        int i18 = ceil;
                        long j11 = anVar.f43848j6;
                        org.telegram.messenger.ij ijVar3 = anVar.F5;
                        int i19 = i14;
                        org.telegram.messenger.ij ijVar4 = anVar.f43870l4;
                        qm qmVar = anVar.B5;
                        if (i7 != 4 && !z12) {
                            c11 = 4;
                            arrayList = arrayList2;
                            z15 = false;
                        } else {
                            c11 = 4;
                            arrayList = arrayList2;
                            z15 = true;
                        }
                        i13 = i19;
                        i12 = i18;
                        c10 = c11;
                        org.telegram.messenger.gz.X(accountInstance, arrayList, j11, ijVar3, ijVar4, null, qmVar, z15, z9, null, null, z10, i10, i11, z13, null, anVar.W8(), j3, z11, j10, anVar.h9(), njVar2, null, false);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = anVar.getAccountInstance();
                        long j12 = anVar.f43848j6;
                        org.telegram.messenger.ij ijVar5 = anVar.D5;
                        org.telegram.messenger.ij ijVar6 = anVar.f43870l4;
                        qm qmVar2 = anVar.B5;
                        if (i7 != 4 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        org.telegram.messenger.gz.X(accountInstance2, arrayList2, j12, ijVar5, ijVar6, null, qmVar2, z14, z9, anVar.F5, null, z10, i10, i11, z13, null, anVar.W8(), j3, z11, j10, anVar.h9(), anVar.f44010w5, null, false);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z18 = z20;
                }
                hashMap = selectedPhotos;
                anVar.K6();
                anVar.Z.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (anVar.f43808g4 == -1) {
                    anVar.f43808g4 = 0;
                }
                anVar.f43808g4 += hashMap.size();
                anVar.id(true);
            }
        }
    }

    @Override
    public final void M0(Object obj) {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
