package qh;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.c51;
public final class v2 extends dl0 {
    public final a3 f46188c;

    public v2(a3 a3Var) {
        this.f46188c = a3Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        a3 a3Var = this.f46188c;
        if (a3Var.W) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (a3Var.f44892a0) {
            if (i11 >= 0 && i11 < a3Var.V.size()) {
                return LocaleController.formatYearMont(((s6) a3Var.V.get(i11)).d / 1000, true);
            }
            i11 -= a3Var.V.size();
        }
        ArrayList arrayList = a3Var.f44896c0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) a3Var.f44896c0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int i10;
        int k10 = k();
        a3 a3Var = this.f46188c;
        m2 m2Var = a3Var.f44898e;
        float f11 = m2Var.J;
        int width = (int) (((int) (((tl0Var.getWidth() - tl0Var.getPaddingLeft()) - tl0Var.getPaddingRight()) / f11)) * a3Var.L);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - tl0Var.getPaddingTop()) - tl0Var.getPaddingBottom())), f10) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, m2Var.J * round) + 2;
        iArr[1] = tl0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(tl0 tl0Var) {
        a3 a3Var;
        int k10 = k();
        float f10 = this.f46188c.f44898e.J;
        return (Math.max(0, tl0Var.computeVerticalScrollOffset() - a3Var.getPadding()) - tl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (((tl0Var.getWidth() - tl0Var.getPaddingLeft()) - tl0Var.getPaddingRight()) / f10)) * a3Var.L))) - (AndroidUtilities.displaySize.y - tl0Var.getPaddingTop()));
    }

    @Override
    public final int h() {
        return k() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0 && i10 != h() - 1) {
            if (i10 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int k() {
        int size;
        a3 a3Var = this.f46188c;
        ArrayList arrayList = a3Var.f44896c0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (a3Var.W) {
            return size + 1;
        }
        if (a3Var.f44892a0) {
            return a3Var.V.size() + size;
        }
        return size;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        String str;
        a3 a3Var = this.f46188c;
        ArrayList arrayList = a3Var.f44899e0;
        ArrayList arrayList2 = a3Var.V;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i12 = -1;
        if (i11 == 0) {
            y2 y2Var = (y2) view;
            if (i10 == 0) {
                i12 = a3Var.getPadding();
            }
            y2Var.f46352a = i12;
        } else if (i11 == 2) {
            x2 x2Var = (x2) view;
            boolean z12 = true;
            if (i10 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i10 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            x2Var.R = z4;
            x2Var.S = z10;
            x2Var.J = new u2(this, x2Var, 0);
            x2Var.K = new u2(this, x2Var, 1);
            int i13 = i10 - 2;
            if (a3Var.W) {
                if (i13 == 0) {
                    x2Var.f(-1, false, false);
                    x2Var.e(arrayList2.size(), (s6) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (a3Var.f44892a0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    x2Var.f(-1, false, false);
                    x2Var.e(0, (s6) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = a3Var.f44896c0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) a3Var.f44896c0.get(i13);
                if (arrayList.isEmpty() && !a3Var.N) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (x2Var.P != photoEntry) {
                    z12 = false;
                }
                x2Var.f(indexOf, z11, z12);
                x2Var.P = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                x2Var.g(str);
                x2Var.C = null;
                if (photoEntry == null) {
                    x2Var.L = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb = new StringBuilder();
                    org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb);
                    sb.append(LocaleController.formatDuration(photoEntry.duration));
                    x2Var.L = sb.toString();
                } else {
                    x2Var.L = LocaleController.getString(R.string.AttachPhoto);
                }
                x2Var.b(photoEntry);
                x2Var.invalidate();
                if (a3Var.J) {
                    x2Var.F.setOnClickListener(new r31(this, photoEntry, x2Var, 3));
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        float f10;
        float f11;
        c51 c51Var;
        a3 a3Var = this.f46188c;
        if (i10 == 0) {
            c51Var = new y2(a3Var, a3Var.getContext());
        } else if (i10 == 1) {
            Context context = a3Var.getContext();
            boolean z4 = a3Var.I;
            c51 c51Var2 = new c51(context, 8);
            if (z4) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            c51Var2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(a3Var.getTitle());
            if (z4) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            c51Var2.addView(textView, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            a3Var.f44901f0 = c51Var2;
            c51Var = c51Var2;
        } else {
            c51Var = new x2(a3Var.getContext(), a3Var.f44893b, a3Var.L, a3Var.J);
        }
        return new f2.m1(c51Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4;
        a3 a3Var = this.f46188c;
        ArrayList arrayList = a3Var.f44899e0;
        if (m1Var.f5879f == 2) {
            x2 x2Var = (x2) m1Var.f5875a;
            Object obj = x2Var.P;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !a3Var.N) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                x2Var.f(arrayList.indexOf(photoEntry), z4, false);
                return;
            }
            x2Var.f(-1, false, false);
        }
    }
}
