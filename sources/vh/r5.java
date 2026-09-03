package vh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.gu0;
public final class r5 implements d1 {
    public final w5 f46196a;

    public r5(w5 w5Var) {
        this.f46196a = w5Var;
    }

    @Override
    public final void Q0(CharSequence charSequence) {
        t5 t5Var = this.f46196a.f46347y;
        if (t5Var != null) {
            b3 b3Var = (b3) t5Var;
            if (charSequence != null && charSequence.length() > 0) {
                b3Var.f45897a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean V0(e1 e1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        w5 w5Var = this.f46196a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && (aVar = w5Var.f46346x) != null) {
            s3 s3Var = ((b3) t5Var).f45897a;
            ClipboardManager clipboardManager = (ClipboardManager) s3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList v42 = s3Var.v4(y3.z(htmlText, hashMap));
                            if (!v42.isEmpty() && ((v42.size() != 1 || !s3.E3((a) v42.get(0))) && (indexOf = s3Var.f46217i3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(e1Var.getSelectionStart(), e1Var.getSelectionEnd()));
                                boolean H4 = s3Var.H4(indexOf, indexOf, max, Math.max(max, Math.max(e1Var.getSelectionStart(), e1Var.getSelectionEnd())), v42);
                                if (H4 && !hashMap.isEmpty()) {
                                    s3Var.f46219j3.putAll(hashMap);
                                }
                                return H4;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final void c(e1 e1Var) {
        t5 t5Var = this.f46196a.f46347y;
        if (t5Var != null) {
            s3 s3Var = ((b3) t5Var).f45897a;
            s3.L1(s3Var, e1Var);
            s3Var.f46209e3.d(e1Var, true);
        }
    }

    @Override
    public final void g1(e1 e1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z4;
        int i10;
        e1 editText;
        Editable text;
        w5 w5Var = this.f46196a;
        if (w5Var.f46347y != null && w5Var.f46346x != null) {
            String obj = e1Var.getText().toString();
            ((b3) w5Var.f46347y).f45897a.f46209e3.t(w5Var, null);
            String b10 = w5.b(obj);
            if (b10 != null) {
                ArrayList a2 = l0.a(b10);
                if (!a2.isEmpty()) {
                    w5Var.D((l0) a2.get(0));
                    return;
                }
            }
            int q10 = w5.q(e1Var.getText().toString());
            if (q10 != 0) {
                ((b3) w5Var.f46347y).c(w5Var.f46346x, q10);
                return;
            }
            v5 r10 = w5.r(e1Var.getText().toString(), w5Var.f46346x);
            if (r10 != null) {
                ((b3) w5Var.f46347y).d(w5Var.f46346x, r10.f46313a, r10.f46314b, r10.f46315c, r10.d, r10.e);
            } else if ((w5Var.f46346x.f45853b instanceof TL_iv.pageBlockPullquote) && w5Var.f46341f.length() > 0) {
                w5Var.i();
            } else {
                t5 t5Var = w5Var.f46347y;
                a aVar = w5Var.f46346x;
                s3 s3Var = ((b3) t5Var).f45897a;
                ArrayList arrayList = s3Var.f46226m4;
                w51 w51Var = s3Var.V2;
                ArrayList arrayList2 = s3Var.f46217i3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    d2 d2Var = s3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    View y12 = s3Var.y1(aVar);
                    boolean z10 = y12 instanceof w5;
                    if (z10) {
                        e1 editText2 = ((w5) y12).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = w5.A(aVar.f45853b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f45859k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f45859k;
                            arrayList3.remove(arrayList3.size() - 1);
                            s3Var.r4();
                            w51Var.N(false);
                            d2 d2Var2 = s3Var.G3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                            s3Var.post(new k2(s3Var, aVar, 27));
                            return;
                        } else if (aVar.f45854c > 0) {
                            s3Var.s2(indexOf);
                            s3Var.r4();
                            w51Var.N(false);
                            d2 d2Var3 = s3Var.G3;
                            if (d2Var3 != null) {
                                d2Var3.h();
                            }
                            s3Var.post(new k2(s3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f45853b;
                    ArrayList arrayList4 = aVar.f45859k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = n0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f45853b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            s3Var.f46219j3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f45853b = new TL_iv.pageBlockParagraph();
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    w5.d(aVar.f45853b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    w5.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f45854c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f45859k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    s3Var.r4();
                    if (z4) {
                        w51Var.N(false);
                        d2 d2Var4 = s3Var.G3;
                        if (d2Var4 != null) {
                            d2Var4.h();
                        }
                        s3Var.post(new k2(s3Var, aVar2, 29));
                        return;
                    }
                    if (z10 && (text = (editText = ((w5) y12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    w51Var.S();
                    s3Var.o4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        w51Var.l();
                    } else {
                        f2.t0 itemAnimator = s3Var.getItemAnimator();
                        s3Var.setItemAnimator(null);
                        w51Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            w51Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        s3Var.post(new u2(s3Var, itemAnimator, 0));
                    }
                    d2 d2Var5 = s3Var.G3;
                    if (d2Var5 != null) {
                        d2Var5.h();
                    }
                    s3Var.post(new v2(s3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean h() {
        w5 w5Var = this.f46196a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && w5Var.f46346x != null) {
            return ((b3) t5Var).f45897a.R4();
        }
        return false;
    }

    @Override
    public final boolean h0(e1 e1Var) {
        a aVar;
        w5 w5Var = this.f46196a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var == null || (aVar = w5Var.f46346x) == null) {
            return false;
        }
        return s3.P1(((b3) t5Var).f45897a, aVar, false);
    }

    @Override
    public final void l1(Editable editable) {
        a aVar;
        w5 w5Var = this.f46196a;
        if (w5Var.f46346x != null) {
            w5Var.E(editable);
            w5Var.J();
            w5.d(w5Var.f46346x.f45853b, editable);
            w5Var.C();
            w5Var.G();
            int i10 = 0;
            if (w5Var.o() && !w5Var.l()) {
                ((TL_iv.pageBlockBlockquote) w5Var.f46346x.f45853b).collapsed = false;
            }
            w5Var.H();
            t5 t5Var = w5Var.f46347y;
            if (t5Var != null) {
                s3 s3Var = ((b3) t5Var).f45897a;
                d2 d2Var = s3Var.G3;
                if (d2Var != null) {
                    d2Var.g();
                }
                s3Var.f46209e3.onContentChanged();
            }
            t5 t5Var2 = w5Var.f46347y;
            if (t5Var2 != null) {
                ((b3) t5Var2).f45897a.f46209e3.t(w5Var, w5.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = w5Var.f46346x;
            if (aVar2 != null && obj != null && aVar2.f45854c == 0 && (aVar2.f45853b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && w5Var.f46347y != null) {
                w5Var.post(new gu0(this, w5Var.f46346x, i10, 19));
            } else {
                v5 s6 = w5.s(editable.toString(), w5Var.f46346x);
                if (s6 != null && w5Var.f46347y != null) {
                    w5Var.post(new tf.k1(this, w5Var.f46346x, s6, 12));
                }
            }
            if (!w5Var.Q && ((aVar = w5Var.f46346x) == null || !(aVar.f45853b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            w5Var.invalidate();
        }
    }

    @Override
    public final void n1(e1 e1Var, int i10, int i11) {
        t5 t5Var;
        l9 textSelectionHelper;
        w5 w5Var = this.f46196a;
        if (!w5Var.C && i10 != i11 && (t5Var = w5Var.f46347y) != null && (textSelectionHelper = ((b3) t5Var).f45897a.getTextSelectionHelper()) != null) {
            w5Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 7));
        }
    }

    @Override
    public final void q0() {
        a aVar;
        w5 w5Var = this.f46196a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && (aVar = w5Var.f46346x) != null) {
            s3.P1(((b3) t5Var).f45897a, aVar, true);
        }
    }

    @Override
    public final void r(int i10, int i11) {
        d2 d2Var;
        w5 w5Var = this.f46196a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && w5Var.f46346x != null && (d2Var = ((b3) t5Var).f45897a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean w1(boolean z4) {
        a aVar;
        w5 w5Var = this.f46196a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && (aVar = w5Var.f46346x) != null) {
            return ((b3) t5Var).f45897a.V3(aVar, z4);
        }
        return false;
    }
}
