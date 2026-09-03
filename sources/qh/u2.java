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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.h51;
public final class u2 extends cl0 {
    public final z2 f46164c;

    public u2(z2 z2Var) {
        this.f46164c = z2Var;
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
        z2 z2Var = this.f46164c;
        if (z2Var.W) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (z2Var.f46387a0) {
            if (i11 >= 0 && i11 < z2Var.V.size()) {
                return LocaleController.formatYearMont(((r6) z2Var.V.get(i11)).d / 1000, true);
            }
            i11 -= z2Var.V.size();
        }
        ArrayList arrayList = z2Var.f46391c0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) z2Var.f46391c0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int i10;
        int k10 = k();
        z2 z2Var = this.f46164c;
        l2 l2Var = z2Var.f46393e;
        float f11 = l2Var.J;
        int width = (int) (((int) (((sl0Var.getWidth() - sl0Var.getPaddingLeft()) - sl0Var.getPaddingRight()) / f11)) * z2Var.L);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - sl0Var.getPaddingTop()) - sl0Var.getPaddingBottom())), f10) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, l2Var.J * round) + 2;
        iArr[1] = sl0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(sl0 sl0Var) {
        z2 z2Var;
        int k10 = k();
        float f10 = this.f46164c.f46393e.J;
        return (Math.max(0, sl0Var.computeVerticalScrollOffset() - z2Var.getPadding()) - sl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (((sl0Var.getWidth() - sl0Var.getPaddingLeft()) - sl0Var.getPaddingRight()) / f10)) * z2Var.L))) - (AndroidUtilities.displaySize.y - sl0Var.getPaddingTop()));
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
        z2 z2Var = this.f46164c;
        ArrayList arrayList = z2Var.f46391c0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (z2Var.W) {
            return size + 1;
        }
        if (z2Var.f46387a0) {
            return z2Var.V.size() + size;
        }
        return size;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        String str;
        z2 z2Var = this.f46164c;
        ArrayList arrayList = z2Var.f46394e0;
        ArrayList arrayList2 = z2Var.V;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i12 = -1;
        if (i11 == 0) {
            x2 x2Var = (x2) view;
            if (i10 == 0) {
                i12 = z2Var.getPadding();
            }
            x2Var.f46308a = i12;
        } else if (i11 == 2) {
            w2 w2Var = (w2) view;
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
            w2Var.R = z4;
            w2Var.S = z10;
            w2Var.J = new t2(this, w2Var, 0);
            w2Var.K = new t2(this, w2Var, 1);
            int i13 = i10 - 2;
            if (z2Var.W) {
                if (i13 == 0) {
                    w2Var.f(-1, false, false);
                    w2Var.e(arrayList2.size(), (r6) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (z2Var.f46387a0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    w2Var.f(-1, false, false);
                    w2Var.e(0, (r6) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = z2Var.f46391c0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) z2Var.f46391c0.get(i13);
                if (arrayList.isEmpty() && !z2Var.N) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (w2Var.P != photoEntry) {
                    z12 = false;
                }
                w2Var.f(indexOf, z11, z12);
                w2Var.P = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                w2Var.g(str);
                w2Var.C = null;
                if (photoEntry == null) {
                    w2Var.L = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb = new StringBuilder();
                    org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb);
                    sb.append(LocaleController.formatDuration(photoEntry.duration));
                    w2Var.L = sb.toString();
                } else {
                    w2Var.L = LocaleController.getString(R.string.AttachPhoto);
                }
                w2Var.b(photoEntry);
                w2Var.invalidate();
                if (z2Var.J) {
                    w2Var.F.setOnClickListener(new q31(this, photoEntry, w2Var, 3));
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        float f10;
        float f11;
        h51 h51Var;
        z2 z2Var = this.f46164c;
        if (i10 == 0) {
            h51Var = new x2(z2Var, z2Var.getContext());
        } else if (i10 == 1) {
            Context context = z2Var.getContext();
            boolean z4 = z2Var.I;
            h51 h51Var2 = new h51(context, 8);
            if (z4) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            h51Var2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z2Var.getTitle());
            if (z4) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            h51Var2.addView(textView, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            z2Var.f46396f0 = h51Var2;
            h51Var = h51Var2;
        } else {
            h51Var = new w2(z2Var.getContext(), z2Var.f46388b, z2Var.L, z2Var.J);
        }
        return new f2.m1(h51Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4;
        z2 z2Var = this.f46164c;
        ArrayList arrayList = z2Var.f46394e0;
        if (m1Var.f5879f == 2) {
            w2 w2Var = (w2) m1Var.f5875a;
            Object obj = w2Var.P;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !z2Var.N) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                w2Var.f(arrayList.indexOf(photoEntry), z4, false);
                return;
            }
            w2Var.f(-1, false, false);
        }
    }
}
