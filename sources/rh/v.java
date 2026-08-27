package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class v extends qa {
    public final int T;
    public final Utilities.Callback U;
    public b51 V;
    public final FrameLayout W;
    public final FrameLayout X;
    public final RichMessageLayout.PreviewView Y;
    public final FrameLayout Z;

    public final org.telegram.ui.Cells.g3 f47507a0;

    public final lh.d f47508b0;

    public boolean f47509c0;

    public int f47510d0;

    public TL_iv.RichMessage f47511e0;

    public v(int i10, Context context, Utilities.Callback callback, c6 c6Var) {
        super(context, null, true, false, false, 1, c6Var);
        this.T = i10;
        this.U = callback;
        int i11 = g6.f22999a7;
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
        frameLayout.addView(textView, z5.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.E = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        b6.a(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final v f47454b;

            {
                this.f47454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f47454b.dismiss();
                        break;
                    default:
                        v vVar = this.f47454b;
                        org.telegram.ui.Cells.g3 g3Var = vVar.f47507a0;
                        if (!vVar.f47509c0) {
                            TL_iv.RichMessage richMessage = vVar.f47511e0;
                            if (richMessage == null) {
                                String strTrim = g3Var.f24370b.getText().toString().trim();
                                if (!TextUtils.isEmpty(strTrim)) {
                                    vVar.f47509c0 = true;
                                    vVar.f47508b0.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = strTrim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.f47510d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new cf.a(vVar, 28));
                                    AndroidUtilities.hideKeyboard(g3Var.f24370b);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView, z5.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, c6Var);
        this.Y = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        int i14 = g6.f23053d6;
        previewView.setBackground(g6.b0(iDp, g6.v0(i14, c6Var)));
        frameLayout2.addView(previewView, z5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.f47507a0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24370b;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        g3Var.setBackground(g6.b0(AndroidUtilities.dp(20.0f), g6.v0(i14, c6Var)));
        e3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(g3Var, z5.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        lh.d dVarG = rl.g(24, context, c6Var, true);
        this.f47508b0 = dVarG;
        dVarG.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        final int i15 = 1;
        dVarG.setOnClickListener(new View.OnClickListener(this) {

            public final v f47454b;

            {
                this.f47454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.f47454b.dismiss();
                        break;
                    default:
                        v vVar = this.f47454b;
                        org.telegram.ui.Cells.g3 g3Var2 = vVar.f47507a0;
                        if (!vVar.f47509c0) {
                            TL_iv.RichMessage richMessage = vVar.f47511e0;
                            if (richMessage == null) {
                                String strTrim = g3Var2.f24370b.getText().toString().trim();
                                if (!TextUtils.isEmpty(strTrim)) {
                                    vVar.f47509c0 = true;
                                    vVar.f47508b0.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = strTrim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.f47510d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new cf.a(vVar, 28));
                                    AndroidUtilities.hideKeyboard(g3Var2.f24370b);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.containerView.addView(dVarG, z5.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) dVarG.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) dVarG.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        zk0 zk0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.V.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f47511e0;
        lh.d dVar = this.f47508b0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f47507a0.f24370b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f47510d0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.f47510d0, true);
            this.f47510d0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f47507a0.f24370b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new qf.b(this, 9), 200L);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.T, 0, true, new a8(this, 27), this.resourcesProvider);
        this.V = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
