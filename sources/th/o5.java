package th;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.o6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.k51;
import org.telegram.ui.ll0;
public final class o5 implements c1 {
    public final t5 f48621a;

    public o5(t5 t5Var) {
        this.f48621a = t5Var;
    }

    @Override
    public final void S0(d1 d1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        d1 editText;
        Editable text;
        t5 t5Var = this.f48621a;
        if (t5Var.f48786y != null && t5Var.f48785x != null) {
            String obj = d1Var.getText().toString();
            ((y2) t5Var.f48786y).f48903a.f48638d3.a1(t5Var, null);
            String b10 = t5.b(obj);
            if (b10 != null) {
                ArrayList a2 = k0.a(b10);
                if (!a2.isEmpty()) {
                    t5Var.D((k0) a2.get(0));
                    return;
                }
            }
            int q6 = t5.q(d1Var.getText().toString());
            if (q6 != 0) {
                ((y2) t5Var.f48786y).c(t5Var.f48785x, q6);
                return;
            }
            s5 r6 = t5.r(d1Var.getText().toString(), t5Var.f48785x);
            if (r6 != null) {
                ((y2) t5Var.f48786y).d(t5Var.f48785x, r6.f48747a, r6.f48748b, r6.f48749c, r6.d, r6.f48750e);
            } else if ((t5Var.f48785x.f48328b instanceof TL_iv.pageBlockPullquote) && t5Var.f48780f.length() > 0) {
                t5Var.i();
            } else {
                q5 q5Var = t5Var.f48786y;
                a aVar = t5Var.f48785x;
                p3 p3Var = ((y2) q5Var).f48903a;
                ArrayList arrayList = p3Var.f48655l4;
                k51 k51Var = p3Var.U2;
                ArrayList arrayList2 = p3Var.f48646h3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    View z12 = p3Var.z1(aVar);
                    boolean z11 = z12 instanceof t5;
                    if (z11) {
                        d1 editText2 = ((t5) z12).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = t5.A(aVar.f48328b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f48335k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f48335k;
                            arrayList3.remove(arrayList3.size() - 1);
                            p3Var.s4();
                            k51Var.N(false);
                            b2 b2Var2 = p3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                            p3Var.post(new i2(p3Var, aVar, 27));
                            return;
                        } else if (aVar.f48329c > 0) {
                            p3Var.t2(indexOf);
                            p3Var.s4();
                            k51Var.N(false);
                            b2 b2Var3 = p3Var.F3;
                            if (b2Var3 != null) {
                                b2Var3.h();
                            }
                            p3Var.post(new i2(p3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f48328b;
                    ArrayList arrayList4 = aVar.f48335k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = m0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f48328b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            p3Var.f48648i3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f48328b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t5.d(aVar.f48328b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    t5.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f48329c, i11);
                    aVar2.f48330e = aVar.f48330e;
                    aVar2.f48335k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    p3Var.s4();
                    if (z10) {
                        k51Var.N(false);
                        b2 b2Var4 = p3Var.F3;
                        if (b2Var4 != null) {
                            b2Var4.h();
                        }
                        p3Var.post(new i2(p3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((t5) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    k51Var.S();
                    p3Var.p4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        k51Var.l();
                    } else {
                        f2.u0 itemAnimator = p3Var.getItemAnimator();
                        p3Var.setItemAnimator(null);
                        k51Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            k51Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        p3Var.post(new s2(p3Var, itemAnimator, 0));
                    }
                    b2 b2Var5 = p3Var.F3;
                    if (b2Var5 != null) {
                        b2Var5.h();
                    }
                    p3Var.post(new t2(p3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final void T0(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        k9 textSelectionHelper;
        t5 t5Var = this.f48621a;
        if (!t5Var.B && i10 != i11 && (q5Var = t5Var.f48786y) != null && (textSelectionHelper = ((y2) q5Var).f48903a.getTextSelectionHelper()) != null) {
            t5Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 7));
        }
    }

    @Override
    public final void Z0(CharSequence charSequence) {
        q5 q5Var = this.f48621a.f48786y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence != null && charSequence.length() > 0) {
                y2Var.f48903a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final void e(d1 d1Var) {
        q5 q5Var = this.f48621a.f48786y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).f48903a;
            p3.M1(p3Var, d1Var);
            p3Var.f48638d3.U(d1Var, true);
        }
    }

    @Override
    public final boolean i1(d1 d1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        t5 t5Var = this.f48621a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && (aVar = t5Var.f48785x) != null) {
            p3 p3Var = ((y2) q5Var).f48903a;
            ClipboardManager clipboardManager = (ClipboardManager) p3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = p3Var.w4(v3.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !p3.F3((a) w42.get(0))) && (indexOf = p3Var.f48646h3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(d1Var.getSelectionStart(), d1Var.getSelectionEnd()));
                                boolean I4 = p3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(d1Var.getSelectionStart(), d1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    p3Var.f48648i3.putAll(hashMap);
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
    public final boolean m() {
        t5 t5Var = this.f48621a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && t5Var.f48785x != null) {
            return ((y2) q5Var).f48903a.S4();
        }
        return false;
    }

    @Override
    public final void n1(Editable editable) {
        a aVar;
        t5 t5Var = this.f48621a;
        if (t5Var.f48785x != null) {
            t5Var.E(editable);
            t5Var.J();
            t5.d(t5Var.f48785x.f48328b, editable);
            t5Var.C();
            t5Var.G();
            int i10 = 0;
            if (t5Var.o() && !t5Var.l()) {
                ((TL_iv.pageBlockBlockquote) t5Var.f48785x.f48328b).collapsed = false;
            }
            t5Var.H();
            q5 q5Var = t5Var.f48786y;
            if (q5Var != null) {
                p3 p3Var = ((y2) q5Var).f48903a;
                b2 b2Var = p3Var.F3;
                if (b2Var != null) {
                    b2Var.g();
                }
                p3Var.f48638d3.onContentChanged();
            }
            q5 q5Var2 = t5Var.f48786y;
            if (q5Var2 != null) {
                ((y2) q5Var2).f48903a.f48638d3.a1(t5Var, t5.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = t5Var.f48785x;
            if (aVar2 != null && obj != null && aVar2.f48329c == 0 && (aVar2.f48328b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && t5Var.f48786y != null) {
                t5Var.post(new ll0(this, t5Var.f48785x, i10, 17));
            } else {
                s5 s10 = t5.s(editable.toString(), t5Var.f48785x);
                if (s10 != null && t5Var.f48786y != null) {
                    t5Var.post(new sf.a(this, t5Var.f48785x, s10, 11));
                }
            }
            if (!t5Var.P && ((aVar = t5Var.f48785x) == null || !(aVar.f48328b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            t5Var.invalidate();
        }
    }

    @Override
    public final boolean r0(d1 d1Var) {
        a aVar;
        t5 t5Var = this.f48621a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var == null || (aVar = t5Var.f48785x) == null) {
            return false;
        }
        return p3.Q1(((y2) q5Var).f48903a, aVar, false);
    }

    @Override
    public final boolean t1(boolean z10) {
        a aVar;
        t5 t5Var = this.f48621a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && (aVar = t5Var.f48785x) != null) {
            return ((y2) q5Var).f48903a.W3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void u0() {
        a aVar;
        t5 t5Var = this.f48621a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && (aVar = t5Var.f48785x) != null) {
            p3.Q1(((y2) q5Var).f48903a, aVar, true);
        }
    }

    @Override
    public final void z(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.f48621a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && t5Var.f48785x != null && (b2Var = ((y2) q5Var).f48903a.F3) != null) {
            b2Var.f(i10, i11);
        }
    }
}
