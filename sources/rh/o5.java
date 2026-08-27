package rh;

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
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.ol0;

public final class o5 implements c1 {

    public final t5 f47322a;

    public o5(t5 t5Var) {
        this.f47322a = t5Var;
    }

    @Override
    public final void B(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.f47322a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || t5Var.f47487x == null || (b2Var = ((y2) q5Var).f47605a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override
    public final void K0() {
        a aVar;
        t5 t5Var = this.f47322a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || (aVar = t5Var.f47487x) == null) {
            return;
        }
        p3.Q1(((y2) q5Var).f47605a, aVar, true);
    }

    @Override
    public final void N1(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        j9 textSelectionHelper;
        t5 t5Var = this.f47322a;
        if (t5Var.B || i10 == i11 || (q5Var = t5Var.f47488y) == null || (textSelectionHelper = ((y2) q5Var).f47605a.getTextSelectionHelper()) == null) {
            return;
        }
        t5Var.post(new nh.j4(this, d1Var, i11, textSelectionHelper, i10, 7));
    }

    @Override
    public final boolean T1(boolean z10) {
        a aVar;
        t5 t5Var = this.f47322a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || (aVar = t5Var.f47487x) == null) {
            return false;
        }
        return ((y2) q5Var).f47605a.W3(aVar, z10);
    }

    @Override
    public final boolean f1(d1 d1Var) {
        a aVar;
        t5 t5Var = this.f47322a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || (aVar = t5Var.f47487x) == null) {
            return false;
        }
        return p3.Q1(((y2) q5Var).f47605a, aVar, false);
    }

    @Override
    public final void g(d1 d1Var) {
        q5 q5Var = this.f47322a.f47488y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).f47605a;
            p3.M1(p3Var, d1Var);
            p3Var.f47340d3.n0(d1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        q5 q5Var = this.f47322a.f47488y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            y2Var.f47605a.t4(charSequence.toString());
        }
    }

    @Override
    public final boolean n() {
        t5 t5Var = this.f47322a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || t5Var.f47487x == null) {
            return false;
        }
        return ((y2) q5Var).f47605a.S4();
    }

    @Override
    public final boolean o0(d1 d1Var) {
        a aVar;
        ClipData primaryClip;
        int iIndexOf;
        t5 t5Var = this.f47322a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var != null && (aVar = t5Var.f47487x) != null) {
            p3 p3Var = ((y2) q5Var).f47605a;
            ClipboardManager clipboardManager = (ClipboardManager) p3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap map = new HashMap();
                        try {
                            ArrayList arrayListW4 = p3Var.w4(v3.z(htmlText, map));
                            if (!arrayListW4.isEmpty() && ((arrayListW4.size() != 1 || !p3.F3((a) arrayListW4.get(0))) && (iIndexOf = p3Var.f47348h3.indexOf(aVar)) >= 0)) {
                                int iMax = Math.max(0, Math.min(d1Var.getSelectionStart(), d1Var.getSelectionEnd()));
                                boolean zI4 = p3Var.I4(iIndexOf, iIndexOf, iMax, Math.max(iMax, Math.max(d1Var.getSelectionStart(), d1Var.getSelectionEnd())), arrayListW4);
                                if (zI4 && !map.isEmpty()) {
                                    p3Var.f47350i3.putAll(map);
                                }
                                return zI4;
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final void r1(Editable editable) {
        a aVar;
        t5 t5Var = this.f47322a;
        if (t5Var.f47487x == null) {
            return;
        }
        t5Var.E(editable);
        t5Var.J();
        t5.e(t5Var.f47487x.f47028b, editable);
        t5Var.C();
        t5Var.G();
        int i10 = 0;
        if (t5Var.o() && !t5Var.l()) {
            ((TL_iv.pageBlockBlockquote) t5Var.f47487x.f47028b).collapsed = false;
        }
        t5Var.H();
        q5 q5Var = t5Var.f47488y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).f47605a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f47340d3.onContentChanged();
        }
        q5 q5Var2 = t5Var.f47488y;
        if (q5Var2 != null) {
            ((y2) q5Var2).f47605a.f47340d3.a0(t5Var, t5.b(editable.toString()));
        }
        String string = editable.toString();
        a aVar2 = t5Var.f47487x;
        if (aVar2 != null && string != null && aVar2.f47029c == 0 && (aVar2.f47028b instanceof TL_iv.pageBlockParagraph) && string.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || t5Var.f47488y == null) {
            s5 s5VarS = t5.s(editable.toString(), t5Var.f47487x);
            if (s5VarS != null && t5Var.f47488y != null) {
                t5Var.post(new qf.a(this, t5Var.f47487x, s5VarS, 11));
            }
        } else {
            t5Var.post(new ol0(this, t5Var.f47487x, i10, 15));
        }
        if (t5Var.P || ((aVar = t5Var.f47487x) != null && (aVar.f47028b instanceof TL_iv.pageBlockPullquote))) {
            t5Var.invalidate();
        }
    }

    @Override
    public final void w1(d1 d1Var) {
        SpannableStringBuilder spannableStringBuilderA;
        int length;
        Editable editable;
        boolean z10;
        int i10;
        d1 editText;
        Editable text;
        Editable text2;
        t5 t5Var = this.f47322a;
        if (t5Var.f47488y == null || t5Var.f47487x == null) {
            return;
        }
        String string = d1Var.getText().toString();
        ((y2) t5Var.f47488y).f47605a.f47340d3.a0(t5Var, null);
        String strB = t5.b(string);
        if (strB != null) {
            ArrayList arrayListA = k0.a(strB);
            if (!arrayListA.isEmpty()) {
                t5Var.D((k0) arrayListA.get(0));
                return;
            }
        }
        int iQ = t5.q(d1Var.getText().toString());
        if (iQ != 0) {
            ((y2) t5Var.f47488y).c(t5Var.f47487x, iQ);
            return;
        }
        s5 s5VarR = t5.r(d1Var.getText().toString(), t5Var.f47487x);
        if (s5VarR != null) {
            ((y2) t5Var.f47488y).d(t5Var.f47487x, s5VarR.f47449a, s5VarR.f47450b, s5VarR.f47451c, s5VarR.d, s5VarR.f47452e);
            return;
        }
        if ((t5Var.f47487x.f47028b instanceof TL_iv.pageBlockPullquote) && t5Var.f47482f.length() > 0) {
            t5Var.i();
            return;
        }
        q5 q5Var = t5Var.f47488y;
        a aVar = t5Var.f47487x;
        p3 p3Var = ((y2) q5Var).f47605a;
        ArrayList arrayList = p3Var.f47357l4;
        b51 b51Var = p3Var.U2;
        ArrayList arrayList2 = p3Var.f47348h3;
        int iIndexOf = arrayList2.indexOf(aVar);
        if (iIndexOf < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        View viewZ1 = p3Var.z1(aVar);
        boolean z11 = viewZ1 instanceof t5;
        if (z11) {
            d1 editText2 = ((t5) viewZ1).getEditText();
            text2 = editText2.getText();
            length = editText2.getSelectionEnd();
        } else {
            spannableStringBuilderA = t5.A(aVar.f47028b);
            length = spannableStringBuilderA.length();
        }
        if (length >= 0) {
            editable = spannableStringBuilderA;
            if (length > editable.length()) {
                editable = spannableStringBuilderA;
                editable = text2;
                editable = text2;
                length = editable.length();
            }
        } else {
            editable = spannableStringBuilderA;
            editable = text2;
            editable = text2;
            length = editable.length();
        }
        editable = text2;
        if (editable.length() == 0) {
            if (!aVar.f47035k.isEmpty()) {
                ArrayList arrayList3 = aVar.f47035k;
                arrayList3.remove(arrayList3.size() - 1);
                p3Var.s4();
                b51Var.N(false);
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.post(new i2(p3Var, aVar, 27));
                return;
            }
            if (aVar.f47029c > 0) {
                p3Var.t2(iIndexOf);
                p3Var.s4();
                b51Var.N(false);
                b2 b2Var3 = p3Var.F3;
                if (b2Var3 != null) {
                    b2Var3.h();
                }
                p3Var.post(new i2(p3Var, aVar, 28));
                return;
            }
        }
        CharSequence charSequenceSubSequence = editable.subSequence(0, length);
        CharSequence charSequenceSubSequence2 = editable.subSequence(length, editable.length());
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        ArrayList arrayList4 = aVar.f47035k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long jA = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f47028b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                p3Var.f47350i3.put(Long.valueOf(jA), richText);
            }
            arrayList4.add(Long.valueOf(jA));
            aVar.f47028b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        t5.e(aVar.f47028b, charSequenceSubSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        t5.e(pageblockparagraph, charSequenceSubSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.f47029c, i11);
        aVar2.f47030e = aVar.f47030e;
        aVar2.f47035k.addAll(arrayList4);
        int i12 = iIndexOf + 1;
        arrayList2.add(i12, aVar2);
        p3Var.s4();
        if (z10) {
            b51Var.N(false);
            b2 b2Var4 = p3Var.F3;
            if (b2Var4 != null) {
                b2Var4.h();
            }
            p3Var.post(new i2(p3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((t5) viewZ1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        b51Var.S();
        p3Var.p4(i12);
        int iIndexOf2 = arrayList.indexOf(aVar2);
        if (iIndexOf2 < 0) {
            b51Var.l();
        } else {
            f2.v0 itemAnimator = p3Var.getItemAnimator();
            p3Var.setItemAnimator(null);
            b51Var.o(iIndexOf2);
            if (aVar.d > 0 && (i10 = iIndexOf2 + 1) < arrayList.size()) {
                b51Var.q(i10, (arrayList.size() - iIndexOf2) - 1);
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
