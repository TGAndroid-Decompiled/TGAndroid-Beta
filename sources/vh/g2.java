package vh;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.bg0;
public final class g2 extends bk0 {
    public final k2 f51204c;

    public g2(k2 k2Var) {
        this.f51204c = k2Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ff ffVar;
        int i11 = i10 - 2;
        k2 k2Var = this.f51204c;
        if (k2Var.f51400c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (k2Var.f51401d0) {
            if (i11 >= 0 && i11 < k2Var.f51398b0.size()) {
                return dd.e0(((n5) k2Var.f51398b0.get(i11)).d / 1000, true);
            }
            i11 -= k2Var.f51398b0.size();
        }
        ArrayList arrayList = k2Var.f51404f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (ffVar = (ff) k2Var.f51404f0.get(i11)) == null) {
            return null;
        }
        long j10 = ffVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return dd.e0(j10, true);
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int i10;
        int e = e();
        k2 k2Var = this.f51204c;
        oi oiVar = k2Var.e;
        float f10 = oiVar.J;
        int width = (int) (((int) (((uk0Var.getWidth() - uk0Var.getPaddingLeft()) - uk0Var.getPaddingRight()) / f10)) * k2Var.O);
        int ceil = (int) Math.ceil(e / f10);
        float W1 = (org.telegram.messenger.i0.W1(f7, 0, Math.max(0, i10 - ((org.telegram.messenger.i0.f16172q.y - uk0Var.getPaddingTop()) - uk0Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, oiVar.J * round) + 2;
        iArr[1] = uk0Var.getPaddingTop() + ((int) ((W1 - round) * width));
    }

    @Override
    public final float H(uk0 uk0Var) {
        k2 k2Var;
        int e = e();
        float f7 = this.f51204c.e.J;
        return (Math.max(0, uk0Var.computeVerticalScrollOffset() - k2Var.getPadding()) - uk0Var.getPaddingTop()) / ((((int) Math.ceil(e / f7)) * ((int) (((int) (((uk0Var.getWidth() - uk0Var.getPaddingLeft()) - uk0Var.getPaddingRight()) / f7)) * k2Var.O))) - (org.telegram.messenger.i0.f16172q.y - uk0Var.getPaddingTop()));
    }

    @Override
    public final int b() {
        return e() + 3;
    }

    @Override
    public final int d(int i10) {
        if (i10 != 0 && i10 != b() - 1) {
            if (i10 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int e() {
        int size;
        k2 k2Var = this.f51204c;
        ArrayList arrayList = k2Var.f51404f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (k2Var.f51400c0) {
            return size + 1;
        }
        if (k2Var.f51401d0) {
            return k2Var.f51398b0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        k2 k2Var = this.f51204c;
        ArrayList arrayList = k2Var.f51406h0;
        ArrayList arrayList2 = k2Var.f51398b0;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        int i12 = -1;
        if (i11 == 0) {
            i2 i2Var = (i2) view;
            if (i10 == 0) {
                i12 = k2Var.getPadding();
            }
            i2Var.f51289a = i12;
        } else if (i11 == 2) {
            h2 h2Var = (h2) view;
            boolean z13 = true;
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            h2Var.U = z10;
            h2Var.V = z11;
            h2Var.M = new f2(this, h2Var, 0);
            h2Var.N = new f2(this, h2Var, 1);
            int i13 = i10 - 2;
            if (k2Var.f51400c0) {
                if (i13 == 0) {
                    h2Var.f(-1, false, false);
                    h2Var.e(arrayList2.size(), (n5) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (k2Var.f51401d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    h2Var.f(-1, false, false);
                    h2Var.e(0, (n5) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = k2Var.f51404f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                ff ffVar = (ff) k2Var.f51404f0.get(i13);
                if (arrayList.isEmpty() && !k2Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(ffVar);
                if (h2Var.S != ffVar) {
                    z13 = false;
                }
                h2Var.f(indexOf, z12, z13);
                h2Var.S = ffVar;
                if (ffVar != null && ffVar.f14603b && !ffVar.d()) {
                    str = org.telegram.messenger.i0.g0(ffVar.E, false, false);
                } else {
                    str = null;
                }
                h2Var.g(str);
                h2Var.F = null;
                if (ffVar == null) {
                    h2Var.O = null;
                } else if (ffVar.f14603b) {
                    StringBuilder sb2 = new StringBuilder();
                    a30.q(null, 2131753933, sb2, ", ");
                    sb2.append(dd.z(ffVar.E));
                    h2Var.O = sb2.toString();
                } else {
                    h2Var.O = dd.L0(2131753948, null);
                }
                h2Var.b(ffVar);
                h2Var.invalidate();
                if (k2Var.M) {
                    h2Var.I.setOnClickListener(new rh.e7(this, ffVar, h2Var, 7));
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        bg0 bg0Var;
        k2 k2Var = this.f51204c;
        if (i10 == 0) {
            bg0Var = new i2(k2Var, k2Var.getContext());
        } else if (i10 == 1) {
            Context context = k2Var.getContext();
            boolean z10 = k2Var.L;
            bg0 bg0Var2 = new bg0(context, 21);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            bg0Var2.setPadding(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(k2Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            bg0Var2.addView(textView, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            k2Var.f51407i0 = bg0Var2;
            bg0Var = bg0Var2;
        } else {
            bg0Var = new h2(k2Var.getContext(), k2Var.f51397b, k2Var.O, k2Var.M);
        }
        return new s4.c1(bg0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        k2 k2Var = this.f51204c;
        ArrayList arrayList = k2Var.f51406h0;
        if (c1Var.f47912f == 2) {
            h2 h2Var = (h2) c1Var.f47909a;
            Object obj = h2Var.S;
            if (obj instanceof ff) {
                ff ffVar = (ff) obj;
                if (arrayList.isEmpty() && !k2Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                h2Var.f(arrayList.indexOf(ffVar), z10, false);
                return;
            }
            h2Var.f(-1, false, false);
        }
    }
}
