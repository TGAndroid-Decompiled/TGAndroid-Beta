package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class d0 extends f0 {
    public final p9 h;
    public final z8 f48143n;
    public final i0 f48144r;

    public d0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        this.f48144r = i0Var;
        i10 = ((h3) i0Var).currentAccount;
        r rVar = new r(i0Var, 4);
        s sVar = new s(i0Var, 3);
        s sVar2 = new s(i0Var, 4);
        g6Var = ((h3) i0Var).resourcesProvider;
        h61 h61Var = new h61(context, i10, 0, false, rVar, sVar, sVar2, g6Var);
        this.d = h61Var;
        h61Var.o1();
        h61 h61Var2 = this.d;
        h61Var2.V2.f32651r = false;
        h61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f48151b);
        this.f48152c.addView(i0Var.C, c6.g());
        this.f48152c.addView(this.d, c6.g());
        this.f48152c.addView(i0Var.E, c6.g());
        g6Var2 = ((h3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.f48150a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f48150a.setTitleColor(i0Var.getThemedColor(k6.G6));
        this.f48150a.B(i0Var.getThemedColor(k6.f22057z8), false);
        this.f48150a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f48150a.C(i0Var.getThemedColor(k6.f22040y8), false);
        this.f48150a.setTitle(DialogObject.getName(i0Var.f48171f));
        this.f48150a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f48150a.setActionBarMenuOnItemClick(new e(this, 4));
        z8 z8Var = new z8(i0Var.f48171f);
        this.f48143n = z8Var;
        p9 p9Var = new p9(getContext());
        this.h = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        p9Var.e(i0Var.f48171f, z8Var);
        this.f48150a.addView(p9Var, c6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f48152c.addView(this.f48150a, c6.e(-1, 56, 48));
        this.f48152c.addView(i0Var.f48177y, c6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f48150a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(i0Var.f48171f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        g6Var3 = ((h3) i0Var).resourcesProvider;
        qh.d dVar = new qh.d(context2, g6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(i0Var.f48171f)) {
            oq oqVar = new oq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        i0Var.f48172n = dVar;
        dVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 18));
        this.f48152c.addView(dVar, c6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return lf.l0.b(this.f48144r.f48168b.f50541e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f48144r.f48177y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
