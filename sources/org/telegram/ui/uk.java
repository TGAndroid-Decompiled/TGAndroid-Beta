package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class uk implements org.telegram.ui.Components.bi {
    public final cn f50419a;

    public uk(cn cnVar) {
        this.f50419a = cnVar;
    }

    @Override
    public final void F0() {
        this.f50419a.Z.L();
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void Y0(TLRPC.User user) {
        String n10 = org.telegram.messenger.t10.n(user);
        cn cnVar = this.f50419a;
        if (cnVar.Z != null && user != null && !TextUtils.isEmpty(n10)) {
            sj sjVar = cnVar.Z;
            sjVar.setFieldText("@" + n10 + " ");
            cnVar.Z.H0();
        }
    }

    @Override
    public final void c0(org.telegram.ui.Components.qg qgVar) {
        this.f50419a.x8(qgVar);
    }

    @Override
    public final boolean f0() {
        return this.f50419a.ra();
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
        cn cnVar = this.f50419a;
        if (cnVar.getParentActivity() != null && (u2Var = cnVar.X1) != null) {
            boolean z18 = u2Var.f33066x1;
            org.telegram.messenger.ij ijVar = u2Var.B3;
            cnVar.F5 = ijVar;
            if (ijVar != null && (message = ijVar.f23262k) != null) {
                message.invert_media = z11;
            }
            if (i7 != 8 && i7 != 7 && (i7 != 4 || u2Var.f32987a2.getSelectedPhotos().isEmpty())) {
                di.u2 u2Var2 = cnVar.X1;
                if (u2Var2 != null) {
                    u2Var2.L(i7);
                }
                cnVar.bb(i7);
                return;
            }
            di.u2 u2Var3 = cnVar.X1;
            if (u2Var3 != null && i7 != 8) {
                u2Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = cnVar.X1.f32987a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = cnVar.X1.f32987a2.getSelectedPhotosOrder();
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
                        cnVar.C8(((org.telegram.messenger.fz) arrayList2.get(0)).d, ((org.telegram.messenger.fz) arrayList2.get(0)).f22516i);
                        z13 = ((org.telegram.messenger.fz) arrayList2.get(0)).f22527t;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.ij ijVar2 = cnVar.F5;
                    if (ijVar2 != null && ijVar2.p5()) {
                        org.telegram.messenger.nj njVar = cnVar.f44667w5;
                        if (njVar == null) {
                            njVar = org.telegram.messenger.nj.b(cnVar.F5.f23262k.suggested_post);
                        }
                        org.telegram.messenger.nj njVar2 = njVar;
                        org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
                        int i18 = ceil;
                        long j11 = cnVar.f44504j6;
                        org.telegram.messenger.ij ijVar3 = cnVar.F5;
                        int i19 = i14;
                        org.telegram.messenger.ij ijVar4 = cnVar.f44527l4;
                        sm smVar = cnVar.B5;
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
                        org.telegram.messenger.gz.X(accountInstance, arrayList, j11, ijVar3, ijVar4, null, smVar, z15, z9, null, null, z10, i10, i11, z13, null, cnVar.X8(), j3, z11, j10, cnVar.i9(), njVar2, null, false);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = cnVar.getAccountInstance();
                        long j12 = cnVar.f44504j6;
                        org.telegram.messenger.ij ijVar5 = cnVar.D5;
                        org.telegram.messenger.ij ijVar6 = cnVar.f44527l4;
                        sm smVar2 = cnVar.B5;
                        if (i7 != 4 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        org.telegram.messenger.gz.X(accountInstance2, arrayList2, j12, ijVar5, ijVar6, null, smVar2, z14, z9, cnVar.F5, null, z10, i10, i11, z13, null, cnVar.X8(), j3, z11, j10, cnVar.i9(), cnVar.f44667w5, null, false);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z18 = z20;
                }
                hashMap = selectedPhotos;
                cnVar.L6();
                cnVar.Z.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (cnVar.f44463g4 == -1) {
                    cnVar.f44463g4 = 0;
                }
                cnVar.f44463g4 += hashMap.size();
                cnVar.ld(true);
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
