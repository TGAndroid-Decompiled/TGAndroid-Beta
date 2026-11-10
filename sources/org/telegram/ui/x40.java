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
public final class x40 extends org.telegram.ui.Components.vi0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final z40 I;
    public final Context f51511c;
    public final jg.z1 f51513f;
    public Runnable h;
    public boolean f51514n;
    public int f51516s;
    public int f51517w;
    public int f51518x;
    public int f51519y;
    public ArrayList d = new ArrayList();
    public ArrayList f51512e = new ArrayList();
    public final ArrayList f51515r = new ArrayList();

    public x40(z40 z40Var, Context context) {
        TLRPC.Chat M0;
        String substring;
        String substring2;
        TLRPC.User a22;
        this.I = z40Var;
        this.f51511c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.g5 contactsController = z40Var.getContactsController();
        boolean z9 = z40Var.Q;
        ArrayList arrayList = contactsController.f22612e0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User a23 = z40Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (a23 != null && !a23.self && !a23.deleted) {
                this.f51515r.add(a23);
                hashSet.add(Long.valueOf(a23.f27109id));
            }
        }
        if (z40Var.P || z40Var.O || z9) {
            ArrayList arrayList2 = z40Var.getMessagesController().f24948y;
            if (z9) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.m5.E(dialog.f26964id) && !hashSet.contains(Long.valueOf(dialog.f26964id)) && (a22 = z40Var.getMessagesController().a2(Long.valueOf(dialog.f26964id))) != null && !org.telegram.messenger.t10.x(a22) && !org.telegram.messenger.t10.B(a22) && !org.telegram.messenger.t10.t(a22) && !org.telegram.messenger.t10.A(dialog.f26964id) && !org.telegram.messenger.qp.F2(a22)) {
                        this.f51515r.add(a22);
                        hashSet.add(Long.valueOf(a22.f27109id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.m5.z(dialog2.f26964id) && (M0 = z40Var.getMessagesController().M0(Long.valueOf(-dialog2.f26964id))) != null && M0.migrated_to == null && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                        this.f51515r.add(M0);
                    }
                }
            }
            Collections.sort(this.f51515r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f51515r.size()) {
                TLObject tLObject2 = (TLObject) this.f51515r.get(i12);
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
                ArrayList arrayList3 = this.f51515r;
                String a12 = t40.a(tLObject2);
                arrayList3.add(i12, new y40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f51513f = z1Var;
        z1Var.f16992a = new zr(this, 13);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f29277a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f != 0) {
            z40 z40Var = this.I;
            if (z40Var.J != null) {
                View view = d1Var.f57052a;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    Object object = ((org.telegram.ui.Cells.h4) view).getObject();
                    if ((object instanceof TLRPC.User) && z40Var.J.h(((TLRPC.User) object).f27109id) >= 0) {
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
        if (!this.f51514n && i7 >= this.E) {
            ArrayList arrayList = this.f51515r;
            int size = arrayList.size();
            int i10 = this.E;
            if (i7 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i7 - i10);
                if (tLObject instanceof y40) {
                    return ((y40) tLObject).f51891a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.id.f23162b0 == 1) {
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
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z9;
        if (this.h != null) {
            Utilities.f21343g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f51512e.clear();
        this.f51513f.f(null, null);
        jg.z1 z1Var = this.f51513f;
        z40 z40Var = this.I;
        if (!z40Var.O && !z40Var.P) {
            z9 = false;
        } else {
            z9 = true;
        }
        z1Var.g(null, true, z9, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21343g;
            w40 w40Var = new w40(this, str, 0);
            this.h = w40Var;
            p5Var.d(w40Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        z40 z40Var = this.I;
        long j3 = z40Var.H;
        long j10 = z40Var.G;
        this.G = -1;
        this.f51516s = -1;
        this.f51518x = -1;
        this.f51517w = -1;
        this.f51519y = -1;
        this.D = -1;
        if (this.f51514n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f51513f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.f16995e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.H = i11;
            return i11;
        }
        if (z40Var.Q) {
            this.f51518x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z40Var.V) {
            int i12 = i7 + 1;
            this.f51517w = i7;
            this.f51516s = i7;
            i7 += 2;
            this.f51519y = i12;
        } else if (z40Var.W) {
            int i13 = i7 + 1;
            this.f51517w = i7;
            this.f51516s = i7;
            i7 += 2;
            this.D = i13;
        } else {
            this.f51517w = i7;
        }
        this.E = i7;
        int size4 = this.f51515r.size() + i7;
        if (z40Var.R) {
            if (j10 != 0) {
                this.F = org.telegram.messenger.t3.y(3, z40Var.getMessagesController().M0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat M0 = z40Var.getMessagesController().M0(Long.valueOf(j3));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.F = i10;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override
    public final int d(int i7) {
        if (this.f51514n) {
            if (i7 == this.f51513f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i7 != this.f51518x) {
            if (i7 != this.f51516s) {
                if (i7 != this.f51519y && i7 != this.D) {
                    if (this.F != 0 && i7 == 0) {
                        return 2;
                    }
                    if (this.G == i7) {
                        return 3;
                    }
                    int i10 = i7 - this.E;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f51515r;
                        if (i10 < arrayList.size() && (arrayList.get(i7 - this.E) instanceof y40)) {
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
        this.I.w0();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z9;
        CharSequence charSequence;
        String K;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        ArrayList arrayList = this.f51515r;
        z40 z40Var = this.I;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i7 == this.f51518x) {
                        m8Var.o(2131231841, org.telegram.messenger.id.M0(2131749485, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.m6.f28225v6, org.telegram.ui.ActionBar.m6.f28206u6);
                        return;
                    } else if (this.F == 2) {
                        m8Var.o(2131232204, org.telegram.messenger.id.M0(2131752402, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.m6.f28055m6, org.telegram.ui.ActionBar.m6.G6);
                        return;
                    } else {
                        m8Var.o(2131232204, org.telegram.messenger.id.M0(2131749110, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.m6.f28055m6, org.telegram.ui.ActionBar.m6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (this.f51514n) {
                int size = this.d.size();
                jg.z1 z1Var = this.f51513f;
                ArrayList arrayList2 = z1Var.f16995e;
                ArrayList arrayList3 = z1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i7 >= 0 && i7 < size) {
                    tLObject = (TLObject) this.d.get(i7);
                } else if (i7 >= size && i7 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i7 - size);
                } else if (i7 > size + size3 && i7 <= size2 + size + size3) {
                    tLObject = (TLObject) z1Var.f16995e.get(((i7 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = org.telegram.messenger.t3.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i7 < size) {
                        charSequence = (CharSequence) this.f51512e.get(i7);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i7 > size && !TextUtils.isEmpty(K)) {
                        String str = z1Var.f16994c;
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
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.f28130q6, null), A1, length + A1, 33);
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
            } else if (i7 == this.f51519y) {
                h4Var.f29283r = true;
                h4Var.f29281f = "premium";
                h4Var.f29277a.setImageDrawable(org.telegram.ui.Cells.h4.b(h4Var.getContext(), false));
                h4Var.f29278b.l(org.telegram.messenger.id.M0(2131746780, null), false);
                org.telegram.ui.ActionBar.m5 m5Var = h4Var.f29279c;
                int i11 = org.telegram.ui.ActionBar.m6.f28282y6;
                m5Var.setTag(Integer.valueOf(i11));
                if (h4Var.K) {
                    i11 = org.telegram.ui.ActionBar.m6.f27883ch;
                }
                org.telegram.ui.ActionBar.t6.X(m5Var, i11, h4Var.M);
                m5Var.setEmojiColor(m5Var.getTextColor());
                m5Var.l(org.telegram.messenger.id.M0(2131746778, null), false);
                if (z40Var.X == null) {
                    z10 = false;
                }
                h4Var.c(z10, false);
                return;
            } else if (i7 == this.D) {
                h4Var.f29284s = true;
                h4Var.f29281f = "miniapps";
                org.telegram.ui.Components.k9 k9Var = h4Var.f29277a;
                h4Var.getContext();
                k9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.f29278b.l(org.telegram.messenger.id.M0(2131746806, null), false);
                org.telegram.ui.ActionBar.m5 m5Var2 = h4Var.f29279c;
                int i12 = org.telegram.ui.ActionBar.m6.f28282y6;
                m5Var2.setTag(Integer.valueOf(i12));
                if (h4Var.K) {
                    i12 = org.telegram.ui.ActionBar.m6.f27883ch;
                }
                org.telegram.ui.ActionBar.t6.X(m5Var2, i12, h4Var.M);
                m5Var2.setEmojiColor(m5Var2.getTextColor());
                m5Var2.l(org.telegram.messenger.id.M0(2131746805, null), false);
                if (z40Var.Y == null) {
                    z10 = false;
                }
                h4Var.c(z10, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i7 - this.E);
                spannableStringBuilder = null;
            }
            h4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f27109id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f26960id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.h hVar = z40Var.J;
                if (hVar != null && hVar.h(j3) >= 0) {
                    h4Var.c(true, false);
                    h4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (z40Var.Z.h(j3) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h4Var.c(z9, false);
                h4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (this.f51514n) {
            x3Var.setText(org.telegram.messenger.id.M0(2131749535, null));
        } else if (i7 == this.f51516s) {
            x3Var.setText(org.telegram.messenger.id.M0(2131746768, null));
        } else {
            int i13 = i7 - this.E;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.E);
                if (tLObject2 instanceof y40) {
                    x3Var.setText(((y40) tLObject2).f51891a.toUpperCase());
                }
            }
        }
        if (i7 == this.f51517w) {
            if (z40Var.X == null && z40Var.Z.i()) {
                M0 = "";
            } else {
                M0 = org.telegram.messenger.id.M0(2131751457, null);
            }
            x3Var.a(M0, new j40(this, 1));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        Context context = this.f51511c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    x3Var = new org.telegram.ui.Cells.m8(context);
                } else {
                    org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(context, null, 0, null, 1);
                    p50Var.setLayoutParams(new v4.o0(-1, -1));
                    p50Var.f32368e.setVisibility(8);
                    p50Var.d.setText(org.telegram.messenger.id.M0(2131748223, null));
                    p50Var.setAnimateLayoutChange(true);
                    x3Var = p50Var;
                }
            } else {
                x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return new v4.d1(x3Var);
    }
}
