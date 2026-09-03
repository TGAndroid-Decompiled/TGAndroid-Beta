package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.b6;
import k7.d6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import ph.ga;
public final class w extends sa {
    public final int U;
    public final Utilities.Callback V;
    public w51 W;
    public final FrameLayout X;
    public final FrameLayout Y;
    public final RichMessageLayout.PreviewView Z;
    public final FrameLayout f46316a0;
    public final org.telegram.ui.Cells.h3 f46317b0;
    public final ph.d f46318c0;
    public boolean f46319d0;
    public int f46320e0;
    public TL_iv.RichMessage f46321f0;

    public w(int i10, Context context, Utilities.Callback callback, f6 f6Var) {
        super(context, null, true, false, false, 1, f6Var);
        this.U = i10;
        this.V = callback;
        int i11 = j6.f19827a7;
        setBackgroundColor(j6.v0(i11, f6Var));
        fixNavigationBar(j6.v0(i11, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, f6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, b6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.F = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        d6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w f46274b;

            {
                this.f46274b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46274b.dismiss();
                        return;
                    default:
                        w wVar = this.f46274b;
                        org.telegram.ui.Cells.h3 h3Var = wVar.f46317b0;
                        if (!wVar.f46319d0) {
                            TL_iv.RichMessage richMessage = wVar.f46321f0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = wVar.V;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                return;
                            }
                            String trim = h3Var.f21132b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                wVar.f46319d0 = true;
                                wVar.f46318c0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                wVar.f46320e0 = ConnectionsManager.getInstance(wVar.U).sendRequest(tL_messages_composeRichMessageWithAI, new ff.a(wVar, 28));
                                AndroidUtilities.hideKeyboard(h3Var.f21132b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, b6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, f6Var);
        this.Z = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = j6.f19881d6;
        previewView.setBackground(j6.b0(dp, j6.v0(i13, f6Var)));
        frameLayout2.addView(previewView, b6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f46316a0 = frameLayout3;
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f46317b0 = h3Var;
        org.telegram.ui.Cells.f3 f3Var = h3Var.f21132b;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        h3Var.setBackground(j6.b0(AndroidUtilities.dp(20.0f), j6.v0(i13, f6Var)));
        f3Var.addTextChangedListener(new v(this));
        frameLayout3.addView(h3Var, b6.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.f46318c0 = p10;
        p10.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        p10.setOnClickListener(new View.OnClickListener(this) {
            public final w f46274b;

            {
                this.f46274b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46274b.dismiss();
                        return;
                    default:
                        w wVar = this.f46274b;
                        org.telegram.ui.Cells.h3 h3Var2 = wVar.f46317b0;
                        if (!wVar.f46319d0) {
                            TL_iv.RichMessage richMessage = wVar.f46321f0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = wVar.V;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                return;
                            }
                            String trim = h3Var2.f21132b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                wVar.f46319d0 = true;
                                wVar.f46318c0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                wVar.f46320e0 = ConnectionsManager.getInstance(wVar.U).sendRequest(tL_messages_composeRichMessageWithAI, new ff.a(wVar, 28));
                                AndroidUtilities.hideKeyboard(h3Var2.f21132b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(p10, b6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) p10.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) p10.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        rl0 rl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.W.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f46321f0;
        ph.d dVar = this.f46318c0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f46317b0.f21132b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f46320e0 != 0) {
            ConnectionsManager.getInstance(this.U).cancelRequest(this.f46320e0, true);
            this.f46320e0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f46317b0.f21132b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new ga(this, 26), 200L);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.U, 0, true, new ph.d4(this, 28), this.resourcesProvider);
        this.W = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
