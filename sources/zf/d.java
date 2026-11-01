package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f5;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.uk0;
import w7.b6;
public abstract class d extends pk0 {
    public ArrayList D;
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public float M;
    public final Context f55483s;
    public final int f55484w;
    public final boolean f55485x;
    public final a0.h f55486y;
    public final int f55482r = e20.f15506s0;
    public float L = 1.0f;
    public final ArrayList N = new ArrayList();

    public d(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        boolean z11;
        this.f55483s = context;
        this.f55484w = i10;
        this.f55485x = z10;
        this.f55486y = hVar;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        this.G = i11 == 2;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList;
        if (this.F != 2 && !this.I) {
            int i11 = this.f55482r;
            int i12 = this.f55484w;
            i5 r10 = i5.r(i11);
            if (i12 == 2) {
                arrayList = r10.f16224j0;
            } else {
                arrayList = r10.f16222h0;
            }
            int S = S(i10);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i12 != 0 && !this.E) {
                if (S >= 0 && S < arrayList.size()) {
                    return (String) arrayList.get(S);
                }
                return null;
            } else if (S > 0 && S <= arrayList.size()) {
                return (String) arrayList.get(S - 1);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: zf.d.M(int):int");
    }

    @Override
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override
    public final Object O(int i10, int i11) {
        HashMap hashMap;
        ArrayList arrayList;
        int i12;
        boolean z10 = this.K;
        int i13 = this.f55482r;
        if (z10 && i10 == 1 && i11 > 1 && i11 - 2 < i5.r(i13).f16212a0.size()) {
            return i5.r(i13).f16212a0.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.f55484w;
        i5 r10 = i5.r(i13);
        if (i14 == 2) {
            hashMap = r10.f16223i0;
        } else {
            hashMap = r10.f16221g0;
        }
        i5 r11 = i5.r(i13);
        if (i14 == 2) {
            arrayList = r11.f16224j0;
        } else {
            arrayList = r11.f16222h0;
        }
        if (i14 != 0 && !this.E) {
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return wp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i11)).user_id));
                }
            }
            return null;
        } else if (i10 == 0) {
            return null;
        } else {
            if (this.F == 2) {
                if (i10 == 1) {
                    if (i11 >= this.D.size()) {
                        return null;
                    }
                    return wp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) this.D.get(i11)).user_id));
                }
            } else {
                int i15 = i10 - 1;
                if (i15 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i15));
                    if (i11 >= arrayList3.size()) {
                        return null;
                    }
                    return wp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i11)).user_id));
                }
            }
            if (!this.f55485x || i11 < 0 || i11 >= i5.r(i13).f16212a0.size()) {
                return null;
            }
            return i5.r(i13).f16212a0.get(i11);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: zf.d.P(int, int):int");
    }

    @Override
    public final View T(int i10, View view) {
        ArrayList arrayList;
        int i11 = this.f55482r;
        int i12 = this.f55484w;
        i5.r(i11);
        i5 r10 = i5.r(i11);
        if (i12 == 2) {
            arrayList = r10.f16224j0;
        } else {
            arrayList = r10.f16222h0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f55483s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f23132a = textView;
            sc.e.t(textView, 1, 22.0f);
            a7.V(textView, t6.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, b6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.N.add(frameLayout);
            view2 = frameLayout;
        }
        u4 u4Var = (u4) view2;
        float f7 = this.M;
        if (f7 > 0.0f) {
            u4Var.setLetterTextSize(f7);
        }
        u4Var.setLetterProgress(this.L);
        if (this.F != 2 && !this.H && !this.I) {
            if (i12 != 0 && !this.E) {
                if (i10 < arrayList.size()) {
                    u4Var.setLetter((String) arrayList.get(i10));
                    return view2;
                }
                u4Var.setLetter("");
                return view2;
            } else if (i10 == 0) {
                u4Var.setLetter("");
                return view2;
            } else {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    u4Var.setLetter((String) arrayList.get(i13));
                    return view2;
                }
                u4Var.setLetter("");
                return view2;
            }
        }
        u4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.K) {
            if (i10 != 1 || i11 <= 1) {
                return false;
            }
        } else {
            int i12 = this.f55484w;
            int i13 = this.f55482r;
            i5 r10 = i5.r(i13);
            if (i12 == 2) {
                hashMap = r10.f16223i0;
            } else {
                hashMap = r10.f16221g0;
            }
            i5 r11 = i5.r(i13);
            if (i12 == 2) {
                arrayList = r11.f16224j0;
            } else {
                arrayList = r11.f16222h0;
            }
            boolean z10 = this.E;
            if (i12 != 0 && !z10) {
                if (this.I || i11 >= ((ArrayList) hashMap.get(arrayList.get(i10))).size()) {
                    return false;
                }
            } else if (i10 == 0) {
                if (z10) {
                    if (i11 >= 1) {
                        return false;
                    }
                } else if (this.f55485x) {
                    if (i11 >= 2) {
                        return false;
                    }
                } else if (i11 >= 3) {
                    return false;
                }
            } else if (!this.I) {
                if (this.F == 2) {
                    if (i10 == 1 && i11 >= this.D.size()) {
                        return false;
                    }
                } else {
                    int i14 = i10 - 1;
                    if (i14 < arrayList.size() && i11 >= ((ArrayList) hashMap.get(arrayList.get(i14))).size()) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        float f7;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        int i14 = 7;
        boolean z10 = this.E;
        int i15 = this.f55482r;
        boolean z11 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 4) {
                        if (i13 != 7) {
                            if (i13 == 8) {
                                s4 s4Var = (s4) view;
                                int i16 = i11 - 2;
                                if (i16 >= 0 && i16 < i5.r(i15).f16212a0.size()) {
                                    s4Var.a((f5) i5.r(i15).f16212a0.get(i16), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        p4 p4Var = (p4) view;
                        if (this.K && i11 == 1 && i10 == 1) {
                            p4Var.setText(dd.L0(2131749161, null));
                            return;
                        } else if (this.F == 1) {
                            p4Var.setText(dd.L0(2131745302, null));
                            return;
                        } else {
                            p4Var.setText(dd.L0(2131745303, null));
                            return;
                        }
                    }
                    if (!this.J) {
                        f7 = 96.0f;
                    } else {
                        f7 = 25.0f;
                    }
                    view.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(18.0f));
                    return;
                }
                z3 z3Var = (z3) view;
                int i17 = this.F;
                if (i17 == 0) {
                    z3Var.setText(dd.L0(2131751780, null));
                    return;
                } else if (i17 == 1) {
                    z3Var.setText(dd.L0(2131745302, null));
                    return;
                } else {
                    z3Var.setText(dd.L0(2131745303, null));
                    return;
                }
            }
            p8 p8Var = (p8) view;
            boolean z12 = this.f55485x;
            if (!z12 && z10) {
                int i18 = t6.Wl;
                p8Var.g(i18, i18);
            } else {
                int i19 = t6.G6;
                p8Var.g(i19, i19);
            }
            if (i10 == 0) {
                if (z12) {
                    if (i11 == 0) {
                        p8Var.r(dd.L0(2131749161, null), "", false, 2131232708, -14899731, -15431455, false);
                        return;
                    } else if (i11 == 1) {
                        p8Var.r(dd.L0(2131746384, null), "", false, 2131232697, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.G) {
                        p8Var.o(2131232203, dd.L0(2131752402, null), false);
                        return;
                    } else {
                        p8Var.o(2131232203, dd.L0(2131749120, null), false);
                        return;
                    }
                } else if (i11 == 0) {
                    p8Var.r(dd.L0(2131748290, null), "", false, 2131232707, -14899731, -15431455, false);
                    return;
                } else if (i11 == 1) {
                    p8Var.r(dd.L0(2131748300, null), "", false, 2131232698, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            f5 f5Var = (f5) i5.r(i15).f16212a0.get(i11);
            String str = f5Var.f15697i;
            if (str != null && f5Var.f15698j != null) {
                p8Var.k(f5Var.f15697i + " " + f5Var.f15698j, false);
                return;
            } else if (str != null && f5Var.f15698j == null) {
                p8Var.k(str, false);
                return;
            } else {
                p8Var.k(f5Var.f15698j, false);
                return;
            }
        }
        pa paVar = (pa) view;
        paVar.T.f49479a = false;
        if (this.F != 2 && !this.H) {
            i14 = 58;
        }
        paVar.b(i14, 1);
        if (this.F == 2) {
            arrayList2 = this.D;
        } else {
            int i20 = this.f55484w;
            i5 r10 = i5.r(i15);
            if (i20 == 2) {
                hashMap = r10.f16223i0;
            } else {
                hashMap = r10.f16221g0;
            }
            if (i20 == 2) {
                arrayList = i5.r(i15).f16224j0;
            } else {
                arrayList = i5.r(i15).f16222h0;
            }
            if (i20 != 0 && !z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i10 - i12));
        }
        TLRPC.User Z1 = wp.r1(i15).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i11)).user_id));
        paVar.d(Z1, null, null, false);
        if (this.f55486y.h(Z1.f19943id) < 0) {
            z11 = false;
        }
        paVar.c(z11, false);
    }

    public final void Y(int i10, boolean z10) {
        this.F = i10;
        if (i10 == 2) {
            if (this.D == null || z10) {
                int i11 = this.f55482r;
                this.D = new ArrayList(i5.r(i11).f16218e0);
                long j10 = e20.i(i11).f15524n;
                int size = this.D.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.D.get(i12)).user_id == j10) {
                        this.D.remove(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            Z();
            return;
        }
        f();
    }

    public final void Z() {
        int i10 = this.f55482r;
        if (this.D == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.D, new u20(wp.r1(i10), currentTime, 1));
            f();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        float f7;
        View view2;
        Context context = this.f55483s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 9) {
                                        view = new c7(context, (org.telegram.ui.Cells.f1) null);
                                    } else {
                                        View bnVar = new bn(context, 28);
                                        bnVar.setId(9);
                                        bnVar.setTag(-33024);
                                        view2 = bnVar;
                                    }
                                } else {
                                    view = new s4(context, false);
                                }
                            } else {
                                view = new p4(this.f55483s, t6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout kVar = new ph.k(this, context, viewGroup);
                            kVar.addView(new hq(context), b6.e(-1, -2, 17));
                            kVar.setLayoutParams(new s4.o0(-1, -2));
                            kVar.setTag(-33024);
                            view2 = kVar;
                        }
                        view = view2;
                    } else {
                        View g3Var = new g3(context, null);
                        float f10 = 72.0f;
                        if (dd.X) {
                            f7 = 28.0f;
                        } else {
                            f7 = 72.0f;
                        }
                        int L = org.telegram.messenger.i0.L(f7);
                        int L2 = org.telegram.messenger.i0.L(8.0f);
                        if (!dd.X) {
                            f10 = 28.0f;
                        }
                        g3Var.setPadding(L, L2, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(8.0f));
                        view = g3Var;
                    }
                } else {
                    view = new z3(context, null);
                }
            } else {
                view = new p8(context);
            }
        } else {
            pa paVar = new pa(context, 58, 1, false);
            paVar.setCallCellStyle(58);
            view = paVar;
        }
        return new s4.c1(view);
    }
}
