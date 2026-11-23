package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.v6;
import hi.o7;
import hi.r7;
import java.util.ArrayList;
import org.telegram.messenger.b20;
import org.telegram.messenger.w10;
import org.telegram.ui.Wallet.j9;
import org.telegram.ui.Wallet.o5;
public final class d extends q2 {
    public final ArrayList D0;
    public o7 E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public b J0;
    public a K0;
    public w10 L0;
    public w10 M0;
    public final o5 N0;
    public c O0;
    public float P0;

    public d(Context context, PointF pointF, int i7, sg.g1 g1Var) {
        super(context, pointF, i7, "", g1Var, 3);
        this.D0 = new ArrayList();
        this.N0 = new o5(this, 6);
        this.P0 = -1.0f;
        getEditText().setMaxLines(3);
        getEditText().setTallFrame(true);
        getEditText().addTextChangedListener(new j9(this, 6));
    }

    public static void v(f fVar, int i7) {
        if (i7 == 3) {
            float textSize = fVar.getTextSize();
            fVar.setShadowLayer(Math.max(1.0f, 0.09f * textSize), 0.0f, textSize * 0.025f, Integer.MIN_VALUE);
            return;
        }
        fVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public float getLineWidth() {
        return (this.I0 - getEditText().getPaddingLeft()) - getEditText().getPaddingRight();
    }

    public ArrayList<o7> getSegments() {
        return this.D0;
    }

    @Override
    public float getSelectionWidth() {
        float f10 = this.P0;
        if (f10 >= 0.0f) {
            return f10;
        }
        return super.getSelectionWidth();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5 o5Var = this.N0;
        removeCallbacks(o5Var);
        postOnAnimation(o5Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.N0);
        super.onDetachedFromWindow();
    }

    @Override
    public final void q() {
        if (!this.G0) {
            this.G0 = true;
            getEditText().setSpokenWords(null);
            w10 w10Var = this.L0;
            if (w10Var != null) {
                w10Var.a(Boolean.TRUE);
            }
        }
        super.q();
    }

    @Override
    public final void r() {
        super.r();
        if (this.G0) {
            this.G0 = false;
            w10 w10Var = this.L0;
            if (w10Var != null) {
                w10Var.a(Boolean.FALSE);
            }
            z();
        }
    }

    @Override
    public final void s() {
        super.s();
        if (getEditText() != null) {
            v(getEditText(), getType());
        }
    }

    @Override
    public void setBaseFontSize(int i7) {
        super.setBaseFontSize(i7);
        v(getEditText(), getType());
    }

    public void setLoading(boolean z10) {
        if (this.F0 == z10) {
            return;
        }
        this.F0 = z10;
        t();
    }

    @Override
    public void setMaxWidth(int i7) {
        this.I0 = i7;
        super.setMaxWidth(i7);
    }

    public void setOnEditing(w10 w10Var) {
        this.L0 = w10Var;
    }

    public void setOnSeek(w10 w10Var) {
        this.M0 = w10Var;
    }

    public void setPendingProvider(a aVar) {
        this.K0 = aVar;
    }

    public void setPositionProvider(b bVar) {
        this.J0 = bVar;
    }

    public void setRangeProvider(c cVar) {
        this.O0 = cVar;
    }

    public void setSegments(ArrayList<o7> arrayList) {
        ArrayList<o7> arrayList2 = this.D0;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        o7 o7Var = this.E0;
        if (o7Var != null && !arrayList2.contains(o7Var) && !this.G0) {
            this.E0 = null;
        }
        z();
    }

    public void setSelectionWidth(float f10) {
        if (this.P0 == f10) {
            return;
        }
        this.P0 = f10;
        m();
    }

    @Override
    public final void t() {
        f editText = getEditText();
        if (editText == null) {
            return;
        }
        if (this.F0 && editText.getText().length() <= 0) {
            editText.setHint("…");
            editText.setHintTextColor(-1711276033);
            return;
        }
        editText.setHint((CharSequence) null);
    }

    public final void u(long j3, long j10, String str, int[] iArr) {
        ?? obj = new Object();
        obj.f15159a = j3;
        obj.f15160b = j10;
        obj.f15161c = str;
        obj.d = iArr;
        obj.f15162e = true;
        this.D0.add(obj);
    }

    public final o7 w(int i7) {
        int indexOf;
        int i10;
        o7 o7Var = this.E0;
        ArrayList arrayList = this.D0;
        if (o7Var == null) {
            indexOf = -1;
        } else {
            indexOf = arrayList.indexOf(o7Var);
        }
        if (indexOf >= 0 && (i10 = indexOf + i7) >= 0 && i10 < arrayList.size()) {
            o7 o7Var2 = (o7) arrayList.get(i10);
            c cVar = this.O0;
            if (cVar != null) {
                long N1 = ((hi.a0) ((ob.c) cVar).f21874b).f14168a.N1();
                long Z0 = ((hi.a0) ((ob.c) this.O0).f21874b).f14168a.Z0();
                if (o7Var2.f15160b > N1) {
                    if (Z0 > N1 && o7Var2.f15159a >= Z0) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return o7Var2;
        }
        return null;
    }

    public final CharSequence x(int i7) {
        o7 o7Var;
        if (this.G0) {
            o7Var = w(i7);
        } else {
            o7Var = null;
        }
        if (o7Var == null) {
            return null;
        }
        CharSequence charSequence = o7Var.f15161c;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public final void y(int i7, int i10, ArrayList arrayList) {
        Typeface typeface;
        String charSequence;
        float f10;
        float f11;
        float f12;
        int makeMeasureSpec;
        int[] iArr;
        d dVar = this;
        int i11 = i7;
        ArrayList arrayList2 = dVar.D0;
        if (!arrayList2.isEmpty() && i11 > 0 && i10 > 0) {
            f fVar = new f(dVar.getContext());
            fVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            int i12 = 0;
            fVar.setBackgroundColor(0);
            fVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            if (dVar.getTypeface() != null) {
                typeface = dVar.getTypeface().d();
            } else {
                typeface = null;
            }
            if (typeface != null) {
                fVar.setTypeface(typeface);
            }
            fVar.setTextSize(0, dVar.getTextSize());
            fVar.setBreakStrategy(0);
            if (dVar.getType() != 3) {
                fVar.setFrameColor(-16777216);
            }
            fVar.setHorizontallyScrolling(false);
            fVar.setMaxLines(3);
            int i13 = dVar.I0;
            if (i13 > 0) {
                fVar.setMaxWidth(i13);
            }
            float f13 = 2.0f;
            float width = (dVar.getWidth() / 2.0f) + dVar.getX();
            float height = (dVar.getHeight() / 2.0f) + dVar.getY();
            float scaleX = dVar.getScaleX();
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                o7 o7Var = (o7) arrayList2.get(i14);
                CharSequence charSequence2 = o7Var.f15161c;
                if (charSequence2 == null) {
                    charSequence = "";
                } else {
                    charSequence = charSequence2.toString();
                }
                if (!charSequence.trim().isEmpty()) {
                    f10 = width;
                    if (o7Var.f15160b > o7Var.f15159a) {
                        fVar.setText(charSequence);
                        int i15 = dVar.I0;
                        if (i15 > 0) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                        }
                        fVar.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, i12));
                        int measuredWidth = fVar.getMeasuredWidth() + 1;
                        int measuredHeight = fVar.getMeasuredHeight();
                        if (measuredWidth > 0 && measuredHeight > 0) {
                            b20 b20Var = new b20();
                            b20Var.f23124a = (byte) 11;
                            f12 = f13;
                            f11 = height;
                            b20Var.V = o7Var.f15159a;
                            b20Var.W = o7Var.f15160b;
                            int[] iArr2 = o7Var.d;
                            if (iArr2 == null) {
                                iArr = null;
                            } else {
                                iArr = (int[]) iArr2.clone();
                            }
                            b20Var.X = iArr;
                            b20Var.f23132j = charSequence;
                            b20Var.f23126b = (byte) dVar.getType();
                            b20Var.f23134l = dVar.getSwatch().f57335a;
                            b20Var.f23135m = dVar.getTextSize();
                            b20Var.f23136n = dVar.getTypeface();
                            b20Var.f23138p = dVar.getAlign();
                            b20Var.f23139q = measuredWidth;
                            b20Var.f23140r = measuredHeight;
                            float f14 = measuredWidth;
                            float f15 = f14 * scaleX;
                            float f16 = i11;
                            b20Var.f23129f = f15 / f16;
                            float f17 = measuredHeight;
                            float f18 = f17 * scaleX;
                            float f19 = i10;
                            b20Var.f23130g = f18 / f19;
                            b20Var.f23127c = (f10 - (f15 / f12)) / f16;
                            b20Var.d = (f11 - (f18 / f12)) / f19;
                            b20Var.f23128e = (float) ((-dVar.getRotation()) * 0.017453292519943295d);
                            b20Var.f23146y = f10 / f16;
                            b20Var.f23147z = f11 / f19;
                            b20Var.f23144w = f14 / f16;
                            b20Var.f23145x = f17 / f19;
                            b20Var.v = scaleX;
                            arrayList.add(b20Var);
                            i14++;
                            dVar = this;
                            i11 = i7;
                            f13 = f12;
                            width = f10;
                            height = f11;
                            i12 = 0;
                        }
                    }
                } else {
                    f10 = width;
                }
                f12 = f13;
                f11 = height;
                i14++;
                dVar = this;
                i11 = i7;
                f13 = f12;
                width = f10;
                height = f11;
                i12 = 0;
            }
        }
    }

    public final void z() {
        b bVar;
        int[] iArr;
        o7 o7Var;
        boolean z10;
        if (!this.G0 && (bVar = this.J0) != null && !this.f58110s) {
            long j3 = bVar.get();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.D0;
                iArr = null;
                if (i7 < arrayList.size()) {
                    o7Var = (o7) arrayList.get(i7);
                    if (j3 >= o7Var.f15159a && j3 < o7Var.f15160b) {
                        break;
                    }
                    i7++;
                } else {
                    o7Var = null;
                    break;
                }
            }
            a aVar = this.K0;
            if (aVar != null) {
                if (o7Var == null) {
                    r7 r7Var = (r7) ((v6) aVar).f9919b;
                    if (r7Var.f15312o && !r7Var.h && !r7Var.e(r7.a(j3))) {
                        r7Var.f();
                        z10 = true;
                        setLoading(z10);
                    }
                }
                z10 = false;
                setLoading(z10);
            }
            String str = (o7Var == null || (str = o7Var.f15161c) == null) ? "" : "";
            if (o7Var != this.E0 || !TextUtils.equals(str, getText())) {
                this.E0 = o7Var;
                this.H0 = true;
                setText(str);
                this.H0 = false;
            }
            f editText = getEditText();
            if (o7Var != null) {
                iArr = o7Var.d;
            }
            editText.setSpokenWords(iArr);
            getEditText().A(j3);
        }
    }
}
