package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x40 extends org.telegram.ui.Components.ij0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final z40 J;
    public final Context f53555c;
    public final jg.z1 f53557f;
    public Runnable h;
    public boolean f53558n;
    public int f53560s;
    public int f53561w;
    public int f53562x;
    public int f53563y;
    public ArrayList d = new ArrayList();
    public ArrayList f53556e = new ArrayList();
    public final ArrayList f53559r = new ArrayList();

    public x40(z40 z40Var, Context context) {
        TLRPC.Chat O0;
        String substring;
        String substring2;
        TLRPC.User c22;
        this.J = z40Var;
        this.f53555c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.i5 contactsController = z40Var.getContactsController();
        boolean z10 = z40Var.R;
        ArrayList arrayList = contactsController.f24567f0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User c23 = z40Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (c23 != null && !c23.self && !c23.deleted) {
                this.f53559r.add(c23);
                hashSet.add(Long.valueOf(c23.f28552id));
            }
        }
        if (z40Var.Q || z40Var.P || z10) {
            ArrayList arrayList2 = z40Var.getMessagesController().f25809y;
            if (z10) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.n5.E(dialog.f28407id) && !hashSet.contains(Long.valueOf(dialog.f28407id)) && (c22 = z40Var.getMessagesController().c2(Long.valueOf(dialog.f28407id))) != null && !org.telegram.messenger.o10.y(c22) && !org.telegram.messenger.o10.C(c22) && !org.telegram.messenger.o10.u(c22) && !org.telegram.messenger.o10.B(dialog.f28407id) && !org.telegram.messenger.mp.L2(c22)) {
                        this.f53559r.add(c22);
                        hashSet.add(Long.valueOf(c22.f28552id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.n5.z(dialog2.f28407id) && (O0 = z40Var.getMessagesController().O0(Long.valueOf(-dialog2.f28407id))) != null && O0.migrated_to == null && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) {
                        this.f53559r.add(O0);
                    }
                }
            }
            Collections.sort(this.f53559r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f53559r.size()) {
                TLObject tLObject2 = (TLObject) this.f53559r.get(i12);
                if (tLObject != null) {
                    String a10 = t40.a(tLObject);
                    if (TextUtils.isEmpty(a10)) {
                        substring = "";
                    } else {
                        substring = a10.substring(0, 1);
                    }
                    String a11 = t40.a(tLObject2);
                    if (TextUtils.isEmpty(a11)) {
                        substring2 = "";
                    } else {
                        substring2 = a11.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.f53559r;
                String a12 = t40.a(tLObject2);
                arrayList3.add(i12, new y40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f53557f = z1Var;
        z1Var.f17727a = new zr(this, 13);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.i4) {
            ((org.telegram.ui.Cells.i4) view).f30810a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f != 0) {
            z40 z40Var = this.J;
            if (z40Var.K != null) {
                View view = f1Var.f59123a;
                if (view instanceof org.telegram.ui.Cells.i4) {
                    Object object = ((org.telegram.ui.Cells.i4) view).getObject();
                    if ((object instanceof TLRPC.User) && z40Var.K.h(((TLRPC.User) object).f28552id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        String str;
        String str2;
        if (!this.f53558n && i7 >= this.F) {
            ArrayList arrayList = this.f53559r;
            int size = arrayList.size();
            int i10 = this.F;
            if (i7 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i7 - i10);
                if (tLObject instanceof y40) {
                    return ((y40) tLObject).f53991a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.gd.f24214b0 == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.f22781g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f53556e.clear();
        this.f53557f.f(null, null);
        jg.z1 z1Var = this.f53557f;
        z40 z40Var = this.J;
        if (!z40Var.P && !z40Var.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        z1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22781g;
            w40 w40Var = new w40(this, str, 0);
            this.h = w40Var;
            q5Var.d(w40Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        z40 z40Var = this.J;
        long j3 = z40Var.I;
        long j10 = z40Var.H;
        this.H = -1;
        this.f53560s = -1;
        this.f53562x = -1;
        this.f53561w = -1;
        this.f53563y = -1;
        this.E = -1;
        if (this.f53558n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f53557f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.f17730e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.I = i11;
            return i11;
        }
        if (z40Var.R) {
            this.f53562x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z40Var.W) {
            int i12 = i7 + 1;
            this.f53561w = i7;
            this.f53560s = i7;
            i7 += 2;
            this.f53563y = i12;
        } else if (z40Var.X) {
            int i13 = i7 + 1;
            this.f53561w = i7;
            this.f53560s = i7;
            i7 += 2;
            this.E = i13;
        } else {
            this.f53561w = i7;
        }
        this.F = i7;
        int size4 = this.f53559r.size() + i7;
        if (z40Var.S) {
            if (j10 != 0) {
                this.G = org.telegram.messenger.v3.y(3, z40Var.getMessagesController().O0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat O0 = z40Var.getMessagesController().O0(Long.valueOf(j3));
                if (org.telegram.messenger.v3.y(3, O0) && !org.telegram.messenger.v3.t0(O0)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.G = i10;
            } else {
                this.G = 0;
            }
            if (this.G != 0) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override
    public final int d(int i7) {
        if (this.f53558n) {
            if (i7 == this.f53557f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i7 != this.f53562x) {
            if (i7 != this.f53560s) {
                if (i7 != this.f53563y && i7 != this.E) {
                    if (this.G != 0 && i7 == 0) {
                        return 2;
                    }
                    if (this.H == i7) {
                        return 3;
                    }
                    int i10 = i7 - this.F;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f53559r;
                        if (i10 < arrayList.size() && (arrayList.get(i7 - this.F) instanceof y40)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void f() {
        super.f();
        this.J.w0();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String M0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z10;
        CharSequence charSequence;
        String K;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        ArrayList arrayList = this.f53559r;
        z40 z40Var = this.J;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i7 == this.f53562x) {
                        n8Var.o(2131231842, org.telegram.messenger.gd.M0(2131749293, null), false);
                        n8Var.g(org.telegram.ui.ActionBar.n6.f29729v6, org.telegram.ui.ActionBar.n6.f29710u6);
                        return;
                    } else if (this.G == 2) {
                        n8Var.o(2131232206, org.telegram.messenger.gd.M0(2131752391, null), false);
                        n8Var.g(org.telegram.ui.ActionBar.n6.f29559m6, org.telegram.ui.ActionBar.n6.G6);
                        return;
                    } else {
                        n8Var.o(2131232206, org.telegram.messenger.gd.M0(2131748918, null), false);
                        n8Var.g(org.telegram.ui.ActionBar.n6.f29559m6, org.telegram.ui.ActionBar.n6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (this.f53558n) {
                int size = this.d.size();
                jg.z1 z1Var = this.f53557f;
                ArrayList arrayList2 = z1Var.f17730e;
                ArrayList arrayList3 = z1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i7 >= 0 && i7 < size) {
                    tLObject = (TLObject) this.d.get(i7);
                } else if (i7 >= size && i7 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i7 - size);
                } else if (i7 > size + size3 && i7 <= size2 + size + size3) {
                    tLObject = (TLObject) z1Var.f17730e.get(((i7 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = org.telegram.messenger.v3.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i7 < size) {
                        charSequence = (CharSequence) this.f53556e.get(i7);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i7 > size && !TextUtils.isEmpty(K)) {
                        String str = z1Var.f17729c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) K);
                            int A1 = org.telegram.messenger.g0.A1(K, str);
                            if (A1 != -1) {
                                int length = str.length();
                                if (A1 == 0) {
                                    length++;
                                } else {
                                    A1++;
                                }
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29634q6, null), A1, length + A1, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = K;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i7 == this.f53563y) {
                i4Var.f30816r = true;
                i4Var.f30814f = "premium";
                i4Var.f30810a.setImageDrawable(org.telegram.ui.Cells.i4.b(i4Var.getContext(), false));
                i4Var.f30811b.l(org.telegram.messenger.gd.M0(2131746587, null), false);
                org.telegram.ui.ActionBar.n5 n5Var = i4Var.f30812c;
                int i11 = org.telegram.ui.ActionBar.n6.f29786y6;
                n5Var.setTag(Integer.valueOf(i11));
                if (i4Var.L) {
                    i11 = org.telegram.ui.ActionBar.n6.f29440fh;
                }
                org.telegram.ui.ActionBar.u6.X(n5Var, i11, i4Var.N);
                n5Var.setEmojiColor(n5Var.getTextColor());
                n5Var.l(org.telegram.messenger.gd.M0(2131746585, null), false);
                if (z40Var.Y == null) {
                    z11 = false;
                }
                i4Var.c(z11, false);
                return;
            } else if (i7 == this.E) {
                i4Var.f30817s = true;
                i4Var.f30814f = "miniapps";
                org.telegram.ui.Components.q9 q9Var = i4Var.f30810a;
                i4Var.getContext();
                q9Var.setImageDrawable(org.telegram.ui.Cells.i4.a(false));
                i4Var.f30811b.l(org.telegram.messenger.gd.M0(2131746613, null), false);
                org.telegram.ui.ActionBar.n5 n5Var2 = i4Var.f30812c;
                int i12 = org.telegram.ui.ActionBar.n6.f29786y6;
                n5Var2.setTag(Integer.valueOf(i12));
                if (i4Var.L) {
                    i12 = org.telegram.ui.ActionBar.n6.f29440fh;
                }
                org.telegram.ui.ActionBar.u6.X(n5Var2, i12, i4Var.N);
                n5Var2.setEmojiColor(n5Var2.getTextColor());
                n5Var2.l(org.telegram.messenger.gd.M0(2131746612, null), false);
                if (z40Var.Z == null) {
                    z11 = false;
                }
                i4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i7 - this.F);
                spannableStringBuilder = null;
            }
            i4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f28552id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f28403id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.h hVar = z40Var.K;
                if (hVar != null && hVar.h(j3) >= 0) {
                    i4Var.c(true, false);
                    i4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (z40Var.f54357a0.h(j3) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.c(z10, false);
                i4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        if (this.f53558n) {
            y3Var.setText(org.telegram.messenger.gd.M0(2131749360, null));
        } else if (i7 == this.f53560s) {
            y3Var.setText(org.telegram.messenger.gd.M0(2131746575, null));
        } else {
            int i13 = i7 - this.F;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.F);
                if (tLObject2 instanceof y40) {
                    y3Var.setText(((y40) tLObject2).f53991a.toUpperCase());
                }
            }
        }
        if (i7 == this.f53561w) {
            if (z40Var.Y == null && z40Var.f54357a0.i()) {
                M0 = "";
            } else {
                M0 = org.telegram.messenger.gd.M0(2131751446, null);
            }
            y3Var.a(M0, new j40(this, 1));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View y3Var;
        Context context = this.f53555c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    y3Var = new org.telegram.ui.Cells.n8(context);
                } else {
                    org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(context, null, 0, null, 1);
                    a60Var.setLayoutParams(new v4.q0(-1, -1));
                    a60Var.f36896e.setVisibility(8);
                    a60Var.d.setText(org.telegram.messenger.gd.M0(2131748031, null));
                    a60Var.setAnimateLayoutChange(true);
                    y3Var = a60Var;
                }
            } else {
                y3Var = new org.telegram.ui.Cells.i4(context, 1, 0, false);
            }
        } else {
            y3Var = new org.telegram.ui.Cells.y3(context, null);
        }
        return new v4.f1(y3Var);
    }
}
