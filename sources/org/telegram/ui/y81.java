package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y81 extends org.telegram.ui.Components.km0 {
    public int f43794c0;
    public int d;
    public final t91 f43795d0;
    public int f43793c = -1;
    public int e = -1;
    public int f43796f = -1;
    public int h = -1;
    public int f43797n = -1;
    public int f43798r = -1;
    public int f43799s = -1;
    public int v = -1;
    public int f43800w = -1;
    public int f43801x = -1;
    public int f43802y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public final a0.g f43791a0 = new a0.g(0);
    public final a0.g f43792b0 = new a0.g(0);

    public y81(t91 t91Var) {
        this.f43795d0 = t91Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.f43798r = -1;
        this.v = -1;
        this.f43800w = -1;
        this.f43801x = -1;
        this.I = -1;
        this.J = -1;
        this.f43796f = -1;
        this.H = -1;
        this.f43799s = -1;
        this.f43797n = -1;
        this.f43802y = -1;
        this.G = -1;
        this.F = -1;
        this.E = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f43794c0 = 0;
        a0.g gVar = this.f43792b0;
        gVar.clear();
        a0.g gVar2 = this.f43791a0;
        gVar2.clear();
        t91 t91Var = this.f43795d0;
        ArrayList arrayList = t91Var.f41968v0;
        ArrayList arrayList2 = t91Var.P;
        ArrayList arrayList3 = t91Var.Q;
        ArrayList arrayList4 = t91Var.O;
        if (t91Var.f41946c0) {
            if (t91Var.G != null) {
                int i10 = this.f43794c0;
                this.f43793c = i10;
                this.f43794c0 = i10 + 2;
                this.d = i10 + 1;
            }
            f91 f91Var = t91Var.d;
            if (f91Var != null && !f91Var.f37251l) {
                int i11 = this.f43794c0;
                if (i11 > 0) {
                    this.f43794c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f43794c0;
                this.f43794c0 = i12 + 1;
                this.e = i12;
            }
            f91 f91Var2 = t91Var.H;
            if (f91Var2 != null && !f91Var2.f37251l) {
                int i13 = this.f43794c0;
                if (i13 > 0) {
                    this.f43794c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f43794c0;
                this.f43794c0 = i14 + 1;
                this.K = i14;
            }
            f91 f91Var3 = t91Var.I;
            if (f91Var3 != null && !f91Var3.f37251l && !f91Var3.f37243a) {
                int i15 = this.f43794c0;
                if (i15 > 0) {
                    this.f43794c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f43794c0;
                this.f43794c0 = i16 + 1;
                this.L = i16;
            }
            f91 f91Var4 = t91Var.J;
            if (f91Var4 != null && !f91Var4.f37251l && !f91Var4.f37243a) {
                int i17 = this.f43794c0;
                if (i17 > 0) {
                    this.f43794c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f43794c0;
                this.f43794c0 = i18 + 1;
                this.M = i18;
            }
            f91 f91Var5 = t91Var.K;
            if (f91Var5 != null && !f91Var5.f37251l && !f91Var5.f37243a) {
                int i19 = this.f43794c0;
                if (i19 > 0) {
                    this.f43794c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f43794c0;
                this.f43794c0 = i20 + 1;
                this.N = i20;
            }
            f91 f91Var6 = t91Var.L;
            if (f91Var6 != null && !f91Var6.f37251l && !f91Var6.f37243a) {
                int i21 = this.f43794c0;
                if (i21 > 0) {
                    this.f43794c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f43794c0;
                this.f43794c0 = i22 + 1;
                this.O = i22;
            }
            f91 f91Var7 = t91Var.e;
            if (f91Var7 != null && !f91Var7.f37251l && !f91Var7.f37243a) {
                int i23 = this.f43794c0;
                if (i23 > 0) {
                    this.f43794c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f43794c0;
                this.f43794c0 = i24 + 1;
                this.f43797n = i24;
            }
            f91 f91Var8 = t91Var.M;
            if (f91Var8 != null && !f91Var8.f37251l && !f91Var8.f37243a) {
                int i25 = this.f43794c0;
                if (i25 > 0) {
                    this.f43794c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f43794c0;
                this.f43794c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f43794c0;
                if (i27 > 0) {
                    this.f43794c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f43794c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f43794c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f43794c0 = size;
                if (arrayList4.size() != t91Var.N.size()) {
                    int i30 = this.f43794c0;
                    this.f43794c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f43794c0;
                    this.f43794c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f43794c0;
                if (i32 > 0) {
                    this.f43794c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f43794c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f43794c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f43794c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f43794c0;
                if (i35 > 0) {
                    this.f43794c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f43794c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f43794c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f43794c0 = size3;
            }
            int i38 = this.f43794c0;
            if (i38 > 0) {
                this.f43794c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f43794c0;
                this.f43794c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (t91Var.f41949f != null) {
            int i40 = this.f43794c0;
            this.f43793c = i40;
            this.f43794c0 = i40 + 2;
            this.d = i40 + 1;
        }
        f91 f91Var9 = t91Var.d;
        if (f91Var9 != null && !f91Var9.f37251l) {
            int i41 = this.f43794c0;
            if (i41 > 0) {
                this.f43794c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f43794c0;
            this.f43794c0 = i42 + 1;
            this.e = i42;
        }
        f91 f91Var10 = t91Var.h;
        if (f91Var10 != null && !f91Var10.f37251l) {
            int i43 = this.f43794c0;
            if (i43 > 0) {
                this.f43794c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f43794c0;
            this.f43794c0 = i44 + 1;
            this.h = i44;
        }
        f91 f91Var11 = t91Var.f41971x;
        if (f91Var11 != null && !f91Var11.f37251l) {
            int i45 = this.f43794c0;
            if (i45 > 0) {
                this.f43794c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f43794c0;
            this.f43794c0 = i46 + 1;
            this.f43802y = i46;
        }
        f91 f91Var12 = t91Var.e;
        if (f91Var12 != null && !f91Var12.f37251l) {
            int i47 = this.f43794c0;
            if (i47 > 0) {
                this.f43794c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f43794c0;
            this.f43794c0 = i48 + 1;
            this.f43797n = i48;
        }
        f91 f91Var13 = t91Var.f41964s;
        if (f91Var13 != null && !f91Var13.f37251l) {
            int i49 = this.f43794c0;
            if (i49 > 0) {
                this.f43794c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f43794c0;
            this.f43794c0 = i50 + 1;
            this.v = i50;
        }
        f91 f91Var14 = t91Var.v;
        if (f91Var14 != null && !f91Var14.f37251l) {
            int i51 = this.f43794c0;
            if (i51 > 0) {
                this.f43794c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f43794c0;
            this.f43794c0 = i52 + 1;
            this.f43800w = i52;
        }
        f91 f91Var15 = t91Var.f41969w;
        if (f91Var15 != null && !f91Var15.f37251l) {
            int i53 = this.f43794c0;
            if (i53 > 0) {
                this.f43794c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f43794c0;
            this.f43794c0 = i54 + 1;
            this.f43801x = i54;
        }
        f91 f91Var16 = t91Var.f41957n;
        if (f91Var16 != null && !f91Var16.f37251l) {
            int i55 = this.f43794c0;
            if (i55 > 0) {
                this.f43794c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f43794c0;
            this.f43794c0 = i56 + 1;
            this.f43798r = i56;
        }
        f91 f91Var17 = t91Var.f41962r;
        if (f91Var17 != null && !f91Var17.f37250k && !f91Var17.f37243a) {
            int i57 = this.f43794c0;
            if (i57 > 0) {
                this.f43794c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f43794c0;
            this.f43794c0 = i58 + 1;
            this.f43799s = i58;
        }
        f91 f91Var18 = t91Var.f41973y;
        if (f91Var18 != null && !f91Var18.f37251l && !f91Var18.f37243a) {
            int i59 = this.f43794c0;
            if (i59 > 0) {
                this.f43794c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f43794c0;
            this.f43794c0 = i60 + 1;
            this.E = i60;
        }
        f91 f91Var19 = t91Var.E;
        if (f91Var19 != null && !f91Var19.f37251l && !f91Var19.f37243a) {
            int i61 = this.f43794c0;
            if (i61 > 0) {
                this.f43794c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f43794c0;
            this.f43794c0 = i62 + 1;
            this.F = i62;
        }
        f91 f91Var20 = t91Var.F;
        if (f91Var20 != null && !f91Var20.f37251l && !f91Var20.f37243a) {
            int i63 = this.f43794c0;
            if (i63 > 0) {
                this.f43794c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f43794c0;
            this.f43794c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f43794c0;
        this.f43794c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f43794c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f43794c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f43794c0 = size4;
            if (t91Var.f41965s0.size() != t91Var.f41963r0.size()) {
                int i68 = this.f43794c0;
                this.f43794c0 = i68 + 1;
                this.f43796f = i68;
            } else {
                int i69 = this.f43794c0;
                this.f43794c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f43794c0;
            this.f43794c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.f43794c0;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((q91) this.f43795d0.f41968v0.get(i10 - i11)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f43797n) {
            return 3L;
        }
        if (i10 == this.f43798r) {
            return 4L;
        }
        if (i10 == this.f43802y) {
            return 5L;
        }
        if (i10 == this.f43799s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f43800w) {
            return 8L;
        }
        if (i10 == this.f43801x) {
            return 9L;
        }
        if (i10 == this.K) {
            return 10L;
        }
        if (i10 == this.L) {
            return 11L;
        }
        if (i10 == this.M) {
            return 12L;
        }
        if (i10 == this.N) {
            return 13L;
        }
        if (i10 == this.O) {
            return 14L;
        }
        if (i10 == this.P) {
            return 15L;
        }
        if (i10 == this.E) {
            return 16L;
        }
        if (i10 == this.F) {
            return 17L;
        }
        if (i10 == this.G) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.e && i10 != this.h && i10 != this.f43797n && i10 != this.f43802y && i10 != this.O && i10 != this.K) {
            if (i10 != this.f43798r && i10 != this.f43799s && i10 != this.F) {
                if (i10 != this.v && i10 != this.f43800w && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f43801x && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f43796f) {
                            return 11;
                        }
                        if (this.f43792b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f43793c && i10 != this.T && i10 != this.Q && i10 != this.W) {
                            if (i10 == this.d) {
                                return 14;
                            }
                            if ((i10 >= this.U && i10 <= this.V) || ((i10 >= this.R && i10 <= this.S) || (i10 >= this.X && i10 <= this.Y))) {
                                return 9;
                            }
                            if (i10 == this.Z) {
                                return 15;
                            }
                            return 10;
                        }
                        return 13;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y81.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.x4 x4Var;
        int i11;
        int i12 = 4;
        t91 t91Var = this.f43795d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.o2) t91Var).currentAccount;
            View e91Var = new e91(t91Var, context, i11, i10, t91Var.f41942a0);
            e91Var.setWillNotDraw(false);
            x4Var = e91Var;
        } else if (i10 == 9) {
            View b8Var = new org.telegram.ui.Cells.b8(viewGroup.getContext(), t91Var.f41941a, t91Var.getResourceProvider());
            b8Var.setWillNotDraw(false);
            x4Var = b8Var;
        } else if (i10 == 11) {
            x4Var = new org.telegram.ui.Cells.r4(viewGroup.getContext());
        } else if (i10 == 12) {
            x4Var = new org.telegram.ui.Cells.j3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new lg.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            x4Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (t91Var.f41946c0) {
                i12 = 2;
            }
            x4Var = new n91(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(viewGroup.getContext());
            x4Var2.a(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
            x4Var = x4Var2;
        } else {
            x4Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
        }
        return com.google.android.gms.internal.play_billing.k3.l(x4Var, x4Var, -1, -2);
    }
}
