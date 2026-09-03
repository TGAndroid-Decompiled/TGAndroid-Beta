package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class y6 extends g51 {
    public static final int f46373a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        TLRPC.WebPage webPage;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        z6 z6Var = (z6) view;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = h51Var.D;
        org.telegram.ui.Components.k6 k6Var = z6Var.f46409e;
        org.telegram.ui.Components.k6 k6Var2 = z6Var.d;
        ImageView imageView = z6Var.f46408c;
        ImageView imageView2 = z6Var.f46407b;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        imageView2.setScaleX(f11);
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.4f;
        }
        imageView2.setScaleY(f12);
        if (!z10) {
            f14 = 1.0f;
        }
        imageView.setAlpha(f14);
        if (z10) {
            f13 = 0.4f;
        } else {
            f13 = 1.0f;
        }
        imageView.setScaleX(f13);
        if (z10) {
            f15 = 0.4f;
        }
        imageView.setScaleY(f15);
        if (z10) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            k6Var2.c(str, false, true);
            k6Var.c(webPage.description, false, true);
        } else {
            k6Var2.c(z6Var.h, false, true);
            k6Var.c(z6Var.f46411n, false, true);
        }
        z6Var.f46410f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new z6(context);
    }
}
