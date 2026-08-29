package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
public final class d0 extends f0 {
    public final t9 h;
    public final e9 f46688n;
    public final i0 f46689r;

    public d0(i0 i0Var, Context context) {
        super(i0Var, context);
        this.f46689r = i0Var;
        u51 u51Var = new u51(context, i0.t(i0Var), 0, false, new r(i0Var, 4), new s(i0Var, 3), new s(i0Var, 4), i0.u(i0Var));
        this.d = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.d;
        u51Var2.U2.f29939r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f46696b);
        this.f46697c.addView(i0Var.B, f6.g());
        this.f46697c.addView(this.d, f6.g());
        this.f46697c.addView(i0Var.D, f6.g());
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, i0.v(i0Var));
        this.f46695a = lVar;
        lVar.setOccupyStatusBar(false);
        this.f46695a.setTitleColor(i0Var.getThemedColor(g6.G6));
        this.f46695a.B(i0Var.getThemedColor(g6.f23452z8), false);
        this.f46695a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f46695a.C(i0Var.getThemedColor(g6.y8), false);
        this.f46695a.setTitle(DialogObject.getName(i0Var.f46716f));
        this.f46695a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f46695a.setActionBarMenuOnItemClick(new e(this, 4));
        e9 e9Var = new e9(i0Var.f46716f);
        this.f46688n = e9Var;
        t9 t9Var = new t9(getContext());
        this.h = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        t9Var.e(i0Var.f46716f, e9Var);
        this.f46695a.addView(t9Var, f6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f46697c.addView(this.f46695a, f6.e(-1, 56, 48));
        this.f46697c.addView(i0Var.f46722y, f6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.a0 n10 = this.f46695a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(i0Var.f46716f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        nh.d dVar = new nh.d(getContext(), i0.w(i0Var), true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(i0Var.f46716f)) {
            iq iqVar = new iq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        i0Var.f46717n = dVar;
        dVar.setOnClickListener(new mh.n(this, 18));
        this.f46697c.addView(dVar, f6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return jf.l0.b(this.f46689r.f46713b.f49505e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f46689r.f46722y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
