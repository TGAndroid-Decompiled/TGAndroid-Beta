package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class r5 extends a51 {
    public static final int f51870b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        TLRPC.WebPage webPage;
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        String str;
        s5 s5Var = (s5) view;
        Object obj = b51Var.G;
        if (obj instanceof TLRPC.WebPage) {
            webPage = (TLRPC.WebPage) obj;
        } else {
            webPage = null;
        }
        View.OnClickListener onClickListener = b51Var.D;
        org.telegram.ui.Components.f6 f6Var = s5Var.e;
        org.telegram.ui.Components.f6 f6Var2 = s5Var.d;
        ImageView imageView = s5Var.f51941c;
        ImageView imageView2 = s5Var.f51940b;
        if (webPage != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.4f;
        }
        imageView2.setScaleX(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        imageView2.setScaleY(f11);
        if (!z11) {
            f13 = 1.0f;
        }
        imageView.setAlpha(f13);
        if (z11) {
            f12 = 0.4f;
        } else {
            f12 = 1.0f;
        }
        imageView.setScaleX(f12);
        if (z11) {
            f14 = 0.4f;
        }
        imageView.setScaleY(f14);
        if (z11) {
            if (TextUtils.isEmpty(webPage.site_name)) {
                str = webPage.title;
            } else {
                str = webPage.site_name;
            }
            f6Var2.c(str, false, true);
            f6Var.c(webPage.description, false, true);
        } else {
            f6Var2.c(s5Var.h, false, true);
            f6Var.c(s5Var.f51943n, false, true);
        }
        s5Var.f51942f.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s5(context);
    }
}
