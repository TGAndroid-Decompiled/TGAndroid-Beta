package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class v extends sa {
    public final int T;
    public final Utilities.Callback U;
    public z41 V;
    public final FrameLayout W;
    public final FrameLayout X;
    public final RichMessageLayout.PreviewView Y;
    public final FrameLayout Z;
    public final org.telegram.ui.Cells.j3 f46745a0;
    public final kh.d f46746b0;
    public boolean f46747c0;
    public int f46748d0;
    public TL_iv.RichMessage f46749e0;

    public v(int i9, Context context, Utilities.Callback callback, b6 b6Var) {
        super(context, null, true, false, false, 1, b6Var);
        this.T = i9;
        this.U = callback;
        int i10 = f6.f22947a7;
        setBackgroundColor(f6.v0(i10, b6Var));
        fixNavigationBar(f6.v0(i10, b6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = f6.G6;
        textView.setTextColor(f6.v0(i11, b6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, e6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.E = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN));
        g6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v f46712b;

            {
                this.f46712b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46712b.dismiss();
                        return;
                    default:
                        v vVar = this.f46712b;
                        org.telegram.ui.Cells.j3 j3Var = vVar.f46745a0;
                        if (!vVar.f46747c0) {
                            TL_iv.RichMessage richMessage = vVar.f46749e0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = j3Var.f24544b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f46747c0 = true;
                                vVar.f46746b0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f46748d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new bf.a(vVar, 28));
                                AndroidUtilities.hideKeyboard(j3Var.f24544b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, e6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i9, b6Var);
        this.Y = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i12 = f6.f23001d6;
        previewView.setBackground(f6.b0(dp, f6.v0(i12, b6Var)));
        frameLayout2.addView(previewView, e6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i9).config.aicomposeTonePromptLengthMax.get(), b6Var);
        this.f46745a0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f24544b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(f6.b0(AndroidUtilities.dp(20.0f), f6.v0(i12, b6Var)));
        h3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(j3Var, e6.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        kh.d i13 = ll.i(24, context, b6Var, true);
        this.f46746b0 = i13;
        i13.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        i13.setOnClickListener(new View.OnClickListener(this) {
            public final v f46712b;

            {
                this.f46712b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46712b.dismiss();
                        return;
                    default:
                        v vVar = this.f46712b;
                        org.telegram.ui.Cells.j3 j3Var2 = vVar.f46745a0;
                        if (!vVar.f46747c0) {
                            TL_iv.RichMessage richMessage = vVar.f46749e0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                return;
                            }
                            String trim = j3Var2.f24544b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                vVar.f46747c0 = true;
                                vVar.f46746b0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                vVar.f46748d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new bf.a(vVar, 28));
                                AndroidUtilities.hideKeyboard(j3Var2.f24544b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(i13, e6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) i13.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) i13.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        wk0 wk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.V.N(false);
        O();
    }

    public final void O() {
        TL_iv.RichMessage richMessage = this.f46749e0;
        kh.d dVar = this.f46746b0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f46745a0.f24544b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f46748d0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.f46748d0, true);
            this.f46748d0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f46745a0.f24544b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new pf.o1(this, 2), 200L);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.T, 0, true, new b8(this, 27), this.resourcesProvider);
        this.V = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
