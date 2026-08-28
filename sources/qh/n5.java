package qh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.z41;
import org.telegram.ui.jh0;
public final class n5 implements c1 {
    public final s5 f46548a;

    public n5(s5 s5Var) {
        this.f46548a = s5Var;
    }

    @Override
    public final boolean A(d1 d1Var) {
        a aVar;
        s5 s5Var = this.f46548a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var == null || (aVar = s5Var.f46709x) == null) {
            return false;
        }
        return o3.Q1(((x2) p5Var).f46827a, aVar, false);
    }

    @Override
    public final void B1(Editable editable) {
        a aVar;
        s5 s5Var = this.f46548a;
        if (s5Var.f46709x != null) {
            s5Var.E(editable);
            s5Var.J();
            s5.e(s5Var.f46709x.f46269b, editable);
            s5Var.C();
            s5Var.G();
            int i9 = 0;
            if (s5Var.o() && !s5Var.l()) {
                ((TL_iv.pageBlockBlockquote) s5Var.f46709x.f46269b).collapsed = false;
            }
            s5Var.H();
            p5 p5Var = s5Var.f46710y;
            if (p5Var != null) {
                o3 o3Var = ((x2) p5Var).f46827a;
                b2 b2Var = o3Var.F3;
                if (b2Var != null) {
                    b2Var.g();
                }
                o3Var.f46565d3.onContentChanged();
            }
            p5 p5Var2 = s5Var.f46710y;
            if (p5Var2 != null) {
                ((x2) p5Var2).f46827a.f46565d3.c2(s5Var, s5.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = s5Var.f46709x;
            if (aVar2 != null && obj != null && aVar2.f46270c == 0 && (aVar2.f46269b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i9 = 6;
            }
            if (i9 != 0 && s5Var.f46710y != null) {
                s5Var.post(new jh0(this, s5Var.f46709x, i9, 15));
            } else {
                r5 s10 = s5.s(editable.toString(), s5Var.f46709x);
                if (s10 != null && s5Var.f46710y != null) {
                    s5Var.post(new pf.a(this, s5Var.f46709x, s10, 11));
                }
            }
            if (!s5Var.P && ((aVar = s5Var.f46709x) == null || !(aVar.f46269b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            s5Var.invalidate();
        }
    }

    @Override
    public final void E(int i9, int i10) {
        b2 b2Var;
        s5 s5Var = this.f46548a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && s5Var.f46709x != null && (b2Var = ((x2) p5Var).f46827a.F3) != null) {
            b2Var.f(i9, i10);
        }
    }

    @Override
    public final void J0() {
        a aVar;
        s5 s5Var = this.f46548a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && (aVar = s5Var.f46709x) != null) {
            o3.Q1(((x2) p5Var).f46827a, aVar, true);
        }
    }

    @Override
    public final void L0(d1 d1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i9;
        d1 editText;
        Editable text;
        s5 s5Var = this.f46548a;
        if (s5Var.f46710y != null && s5Var.f46709x != null) {
            String obj = d1Var.getText().toString();
            ((x2) s5Var.f46710y).f46827a.f46565d3.c2(s5Var, null);
            String b10 = s5.b(obj);
            if (b10 != null) {
                ArrayList a2 = k0.a(b10);
                if (!a2.isEmpty()) {
                    s5Var.D((k0) a2.get(0));
                    return;
                }
            }
            int q10 = s5.q(d1Var.getText().toString());
            if (q10 != 0) {
                ((x2) s5Var.f46710y).c(s5Var.f46709x, q10);
                return;
            }
            r5 r10 = s5.r(d1Var.getText().toString(), s5Var.f46709x);
            if (r10 != null) {
                ((x2) s5Var.f46710y).d(s5Var.f46709x, r10.f46664a, r10.f46665b, r10.f46666c, r10.d, r10.f46667e);
            } else if ((s5Var.f46709x.f46269b instanceof TL_iv.pageBlockPullquote) && s5Var.f46704f.length() > 0) {
                s5Var.i();
            } else {
                p5 p5Var = s5Var.f46710y;
                a aVar = s5Var.f46709x;
                o3 o3Var = ((x2) p5Var).f46827a;
                ArrayList arrayList = o3Var.f46582l4;
                z41 z41Var = o3Var.U2;
                ArrayList arrayList2 = o3Var.f46573h3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    View z12 = o3Var.z1(aVar);
                    boolean z11 = z12 instanceof s5;
                    if (z11) {
                        d1 editText2 = ((s5) z12).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = s5.A(aVar.f46269b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f46276k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f46276k;
                            arrayList3.remove(arrayList3.size() - 1);
                            o3Var.s4();
                            z41Var.N(false);
                            b2 b2Var2 = o3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                            o3Var.post(new i2(o3Var, aVar, 27));
                            return;
                        } else if (aVar.f46270c > 0) {
                            o3Var.t2(indexOf);
                            o3Var.s4();
                            z41Var.N(false);
                            b2 b2Var3 = o3Var.F3;
                            if (b2Var3 != null) {
                                b2Var3.h();
                            }
                            o3Var.post(new i2(o3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f46269b;
                    ArrayList arrayList4 = aVar.f46276k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a3 = m0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f46269b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            o3Var.f46575i3.put(Long.valueOf(a3), richText);
                        }
                        arrayList4.add(Long.valueOf(a3));
                        aVar.f46269b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s5.e(aVar.f46269b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    s5.e(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f46270c, i10);
                    aVar2.f46271e = aVar.f46271e;
                    aVar2.f46276k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    o3Var.s4();
                    if (z10) {
                        z41Var.N(false);
                        b2 b2Var4 = o3Var.F3;
                        if (b2Var4 != null) {
                            b2Var4.h();
                        }
                        o3Var.post(new i2(o3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((s5) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    z41Var.S();
                    o3Var.p4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        z41Var.l();
                    } else {
                        f2.w0 itemAnimator = o3Var.getItemAnimator();
                        o3Var.setItemAnimator(null);
                        z41Var.o(indexOf2);
                        if (aVar.d > 0 && (i9 = indexOf2 + 1) < arrayList.size()) {
                            z41Var.q(i9, (arrayList.size() - indexOf2) - 1);
                        }
                        o3Var.post(new r2(o3Var, itemAnimator, 0));
                    }
                    b2 b2Var5 = o3Var.F3;
                    if (b2Var5 != null) {
                        b2Var5.h();
                    }
                    o3Var.post(new s2(o3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean T1(boolean z10) {
        a aVar;
        s5 s5Var = this.f46548a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && (aVar = s5Var.f46709x) != null) {
            return ((x2) p5Var).f46827a.W3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean U1(d1 d1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        s5 s5Var = this.f46548a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && (aVar = s5Var.f46709x) != null) {
            o3 o3Var = ((x2) p5Var).f46827a;
            ClipboardManager clipboardManager = (ClipboardManager) o3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = o3Var.w4(u3.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !o3.F3((a) w42.get(0))) && (indexOf = o3Var.f46573h3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(d1Var.getSelectionStart(), d1Var.getSelectionEnd()));
                                boolean I4 = o3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(d1Var.getSelectionStart(), d1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    o3Var.f46575i3.putAll(hashMap);
                                }
                                return I4;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final void d(d1 d1Var) {
        p5 p5Var = this.f46548a.f46710y;
        if (p5Var != null) {
            o3 o3Var = ((x2) p5Var).f46827a;
            o3.M1(o3Var, d1Var);
            o3Var.f46565d3.f1(d1Var, true);
        }
    }

    @Override
    public final void h1(CharSequence charSequence) {
        p5 p5Var = this.f46548a.f46710y;
        if (p5Var != null) {
            x2 x2Var = (x2) p5Var;
            if (charSequence != null && charSequence.length() > 0) {
                x2Var.f46827a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final void k1(d1 d1Var, int i9, int i10) {
        p5 p5Var;
        n9 textSelectionHelper;
        s5 s5Var = this.f46548a;
        if (!s5Var.B && i9 != i10 && (p5Var = s5Var.f46710y) != null && (textSelectionHelper = ((x2) p5Var).f46827a.getTextSelectionHelper()) != null) {
            s5Var.post(new mh.l4(this, d1Var, i10, textSelectionHelper, i9, 7));
        }
    }

    @Override
    public final boolean p() {
        s5 s5Var = this.f46548a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && s5Var.f46709x != null) {
            return ((x2) p5Var).f46827a.S4();
        }
        return false;
    }
}
