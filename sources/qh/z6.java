package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class z6 extends i51 {
    public static final int f46391a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        TLRPC.WebPage webPage;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        a7 a7Var = (a7) view;
        Object obj = j51Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = j51Var.D;
        org.telegram.ui.Components.k6 k6Var = a7Var.f44914e;
        org.telegram.ui.Components.k6 k6Var2 = a7Var.d;
        ImageView imageView = a7Var.f44913c;
        ImageView imageView2 = a7Var.f44912b;
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
            k6Var2.c(a7Var.h, false, true);
            k6Var.c(a7Var.f44916n, false, true);
        }
        a7Var.f44915f.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new a7(context);
    }
}
