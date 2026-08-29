package th;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import i7.h6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xa;
public final class v extends xa {
    public final int T;
    public final Utilities.Callback U;
    public k51 V;
    public final FrameLayout W;
    public final FrameLayout X;
    public final RichMessageLayout.PreviewView Y;
    public final FrameLayout Z;
    public final org.telegram.ui.Cells.g3 f48805a0;
    public final nh.d f48806b0;
    public boolean f48807c0;
    public int f48808d0;
    public TL_iv.RichMessage f48809e0;

    public v(int i10, Context context, Utilities.Callback callback, c6 c6Var) {
        super(context, null, true, false, false, 1, c6Var);
        this.T = i10;
        this.U = callback;
        int i11 = g6.f23009a7;
        setBackgroundColor(g6.v0(i11, c6Var));
        fixNavigationBar(g6.v0(i11, c6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = g6.G6;
        textView.setTextColor(g6.v0(i12, c6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, f6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.E = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        h6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v f48752b;

            {
                this.f48752b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48752b.dismiss();
                        return;
                    default:
                        v vVar = this.f48752b;
                        org.telegram.ui.Cells.g3 g3Var = vVar.f48805a0;
                        if (!vVar.f48807c0) {
                            TL_iv.RichMessage richMessage = vVar.f48809e0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = g3Var.f24387b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f48807c0 = true;
                                vVar.f48806b0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f48808d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new ef.a(vVar, 28));
                                AndroidUtilities.hideKeyboard(g3Var.f24387b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, f6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, c6Var);
        this.Y = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = g6.f23062d6;
        previewView.setBackground(g6.b0(dp, g6.v0(i13, c6Var)));
        frameLayout2.addView(previewView, f6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.f48805a0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24387b;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        g3Var.setBackground(g6.b0(AndroidUtilities.dp(20.0f), g6.v0(i13, c6Var)));
        e3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(g3Var, f6.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f48806b0 = o10;
        o10.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        o10.setOnClickListener(new View.OnClickListener(this) {
            public final v f48752b;

            {
                this.f48752b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48752b.dismiss();
                        return;
                    default:
                        v vVar = this.f48752b;
                        org.telegram.ui.Cells.g3 g3Var2 = vVar.f48805a0;
                        if (!vVar.f48807c0) {
                            TL_iv.RichMessage richMessage = vVar.f48809e0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = g3Var2.f24387b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f48807c0 = true;
                                vVar.f48806b0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f48808d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new ef.a(vVar, 28));
                                AndroidUtilities.hideKeyboard(g3Var2.f24387b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(o10, f6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) o10.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) o10.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        jl0 jl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.V.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f48809e0;
        nh.d dVar = this.f48806b0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f48805a0.f24387b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f48808d0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.f48808d0, true);
            this.f48808d0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f48805a0.f24387b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t1(this, 23), 200L);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.T, 0, true, new nh.t4(this, 28), this.resourcesProvider);
        this.V = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
