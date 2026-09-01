package wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import qh.v9;
public final class w extends sa {
    public final int U;
    public final Utilities.Callback V;
    public x51 W;
    public final FrameLayout X;
    public final FrameLayout Y;
    public final RichMessageLayout.PreviewView Z;
    public final FrameLayout f50121a0;
    public final org.telegram.ui.Cells.i3 f50122b0;
    public final qh.d f50123c0;
    public boolean f50124d0;
    public int f50125e0;
    public TL_iv.RichMessage f50126f0;

    public w(int i10, Context context, Utilities.Callback callback, g6 g6Var) {
        super(context, null, true, false, false, 1, g6Var);
        this.U = i10;
        this.V = callback;
        int i11 = k6.f21605a7;
        setBackgroundColor(k6.v0(i11, g6Var));
        fixNavigationBar(k6.v0(i11, g6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = k6.G6;
        textView.setTextColor(k6.v0(i12, g6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, c6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.F = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(i12, g6Var), PorterDuff.Mode.SRC_IN));
        e6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w f50058b;

            {
                this.f50058b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50058b.dismiss();
                        return;
                    default:
                        w wVar = this.f50058b;
                        org.telegram.ui.Cells.i3 i3Var = wVar.f50122b0;
                        if (!wVar.f50124d0) {
                            TL_iv.RichMessage richMessage = wVar.f50126f0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = wVar.V;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                return;
                            }
                            String trim = i3Var.f22955b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                wVar.f50124d0 = true;
                                wVar.f50123c0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                wVar.f50125e0 = ConnectionsManager.getInstance(wVar.U).sendRequest(tL_messages_composeRichMessageWithAI, new gf.a(wVar, 28));
                                AndroidUtilities.hideKeyboard(i3Var.f22955b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, g6Var);
        this.Z = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = k6.f21659d6;
        previewView.setBackground(k6.b0(dp, k6.v0(i13, g6Var)));
        frameLayout2.addView(previewView, c6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f50121a0 = frameLayout3;
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), g6Var);
        this.f50122b0 = i3Var;
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22955b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(k6.b0(AndroidUtilities.dp(20.0f), k6.v0(i13, g6Var)));
        g3Var.addTextChangedListener(new v(this));
        frameLayout3.addView(i3Var, c6.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.f50123c0 = p10;
        p10.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        p10.setOnClickListener(new View.OnClickListener(this) {
            public final w f50058b;

            {
                this.f50058b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50058b.dismiss();
                        return;
                    default:
                        w wVar = this.f50058b;
                        org.telegram.ui.Cells.i3 i3Var2 = wVar.f50122b0;
                        if (!wVar.f50124d0) {
                            TL_iv.RichMessage richMessage = wVar.f50126f0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = wVar.V;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                return;
                            }
                            String trim = i3Var2.f22955b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                wVar.f50124d0 = true;
                                wVar.f50123c0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                wVar.f50125e0 = ConnectionsManager.getInstance(wVar.U).sendRequest(tL_messages_composeRichMessageWithAI, new gf.a(wVar, 28));
                                AndroidUtilities.hideKeyboard(i3Var2.f22955b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(p10, c6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) p10.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) p10.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        tl0 tl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.W.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f50126f0;
        qh.d dVar = this.f50123c0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f50122b0.f22955b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f50125e0 != 0) {
            ConnectionsManager.getInstance(this.U).cancelRequest(this.f50125e0, true);
            this.f50125e0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f50122b0.f22955b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new v9(this, 27), 200L);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.U, 0, true, new qh.d4(this, 28), this.resourcesProvider);
        this.W = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
