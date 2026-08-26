package org.telegram.ui.web;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.SpannableString;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda16;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;

public final class BotWebViewContainer$$ExternalSyntheticLambda35 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public BotWebViewContainer$$ExternalSyntheticLambda35(FrameLayout frameLayout, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run() {
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        final int i = 0;
        final int i2 = 1;
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj4;
                botWebViewContainer.getClass();
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    botWebViewContainer.notifyEvent("file_download_requested", BotWebViewContainer.obj("cancelled", "status"));
                } else {
                    Context context = botWebViewContainer.getContext();
                    String userName = UserObject.getUserName(botWebViewContainer.botUser);
                    final String str = (String) obj2;
                    String str2 = (String) obj;
                    final ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33 = new ArticleViewer$$ExternalSyntheticLambda33(botWebViewContainer, str, str2, 22);
                    HashMap map = BotDownloads.instances;
                    AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
                    String string = LocaleController.getString(R.string.BotDownloadFileTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(44.0f), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, LayoutHelper.createLinear(44, 44, 19, 0, 0, 10, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 15.0f);
                    textViewM.setTypeface(AndroidUtilities.bold());
                    textViewM.setText(str2);
                    textViewM.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlue2, false));
                    linearLayout2.addView(textViewM, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
                    animatedTextView.setTextSize(AndroidUtilities.dp(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    LoadingSpan loadingSpan = new LoadingSpan(AndroidUtilities.dp(55.0f), animatedTextView);
                    int i3 = Theme.key_chat_inFileInfoText;
                    loadingSpan.setColors(Theme.multAlpha(0.35f, Theme.getColor(null, i3, false)), Theme.multAlpha(0.075f, Theme.getColor(null, i3, false)));
                    spannableString.setSpan(loadingSpan, 0, 1, 33);
                    animatedTextView.setText(spannableString);
                    final TodoItemMenu$$ExternalSyntheticLambda17 todoItemMenu$$ExternalSyntheticLambda17 = new TodoItemMenu$$ExternalSyntheticLambda17(animatedTextView, 10);
                    HashMap map2 = BotDownloads.cachedMimeAndSizes;
                    if (map2.containsKey(str)) {
                        Pair pair = (Pair) map2.get(str);
                        todoItemMenu$$ExternalSyntheticLambda17.run((String) pair.first, (Long) pair.second);
                    } else {
                        new AsyncTask() {
                            public String mime;
                            public long size;
                            public final String val$url;
                            public final TodoItemMenu$$ExternalSyntheticLambda17 val$whenDone;

                            public AnonymousClass1() {
                                str = str;
                                todoItemMenu$$ExternalSyntheticLambda17 = todoItemMenu$$ExternalSyntheticLambda17;
                            }

                            @Override
                            public final Object doInBackground(Object[] objArr) {
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                                    httpURLConnection.setRequestMethod("GET");
                                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                                    httpURLConnection.setConnectTimeout(1000);
                                    httpURLConnection.setReadTimeout(1000);
                                    httpURLConnection.setUseCaches(false);
                                    httpURLConnection.setDefaultUseCaches(false);
                                    httpURLConnection.setDoOutput(false);
                                    httpURLConnection.setDoInput(false);
                                    httpURLConnection.getResponseCode();
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        this.size = httpURLConnection.getContentLengthLong();
                                    } else {
                                        this.size = httpURLConnection.getContentLength();
                                    }
                                    String contentType = httpURLConnection.getContentType();
                                    this.mime = contentType;
                                    if (contentType.contains("; ")) {
                                        String str3 = this.mime;
                                        this.mime = str3.substring(0, str3.indexOf("; "));
                                    }
                                    httpURLConnection.getInputStream().close();
                                    return null;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return null;
                                }
                            }

                            @Override
                            public final void onPostExecute(Object obj5) {
                                BotDownloads.cachedMimeAndSizes.put(str, new Pair(this.mime, Long.valueOf(this.size)));
                                todoItemMenu$$ExternalSyntheticLambda17.run(this.mime, Long.valueOf(this.size));
                            }
                        }.execute(str);
                    }
                    animatedTextView.setTextColor(Theme.getColor(null, i3, false));
                    linearLayout2.addView(animatedTextView, LayoutHelper.createLinear(-1, 15));
                    linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 23, 0, 0, 0, 2));
                    builder.setView(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog2, int i4) {
                            switch (i) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        articleViewer$$ExternalSyntheticLambda33.run(Boolean.FALSE);
                                        zArr2[0] = true;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        articleViewer$$ExternalSyntheticLambda33.run(Boolean.TRUE);
                                        zArr3[0] = true;
                                    }
                                    break;
                            }
                        }
                    });
                    builder.setPositiveButton(LocaleController.getString(R.string.BotDownloadFileDownload), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog2, int i4) {
                            switch (i2) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        articleViewer$$ExternalSyntheticLambda33.run(Boolean.FALSE);
                                        zArr2[0] = true;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        articleViewer$$ExternalSyntheticLambda33.run(Boolean.TRUE);
                                        zArr3[0] = true;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(zArr, articleViewer$$ExternalSyntheticLambda33, 13));
                    alertDialog.show();
                }
                break;
            case 1:
                boolean[] zArr2 = (boolean[]) obj4;
                BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12 = (BotWebViewContainer$$ExternalSyntheticLambda12) obj2;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    ((TLRPC.UserFull) obj).bot_can_manage_emoji_status = true;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        botWebViewContainer$$ExternalSyntheticLambda12.run(Boolean.TRUE, "allowed");
                    }
                } else if (!zArr2[0]) {
                    zArr2[0] = true;
                    botWebViewContainer$$ExternalSyntheticLambda12.run(Boolean.TRUE, "cancelled");
                }
                break;
            default:
                ((ChatAttachAlertRichLayout) obj4).listView.turnIntoKeepList((BlockRow) obj3, (TL_iv.PageBlock) obj2);
                ((ItemOptions) obj).dismiss();
                break;
        }
    }

    public BotWebViewContainer$$ExternalSyntheticLambda35(TLObject tLObject, boolean[] zArr, BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12, TLRPC.UserFull userFull) {
        this.$r8$classId = 1;
        this.f$1 = tLObject;
        this.f$0 = zArr;
        this.f$2 = botWebViewContainer$$ExternalSyntheticLambda12;
        this.f$3 = userFull;
    }
}
