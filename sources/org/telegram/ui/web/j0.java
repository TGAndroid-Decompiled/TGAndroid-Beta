package org.telegram.ui.web;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import java.net.URLDecoder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.mc;

public final class j0 implements View.OnLongClickListener {

    public final w0 f43879a;

    public j0(w0 w0Var) {
        this.f43879a = w0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f43879a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i10 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final j0 f43846b;

                {
                    this.f43846b = this;
                }

                @Override
                public final void run() {
                    String strV;
                    String strDecode;
                    String strV2;
                    String strDecode2;
                    int i11 = i10;
                    final String str = extra;
                    final j0 j0Var = this.f43846b;
                    final int i12 = 1;
                    final int i13 = 0;
                    switch (i11) {
                        case 0:
                            w0 w0Var = j0Var.f43879a;
                            e3 e3VarO = org.telegram.messenger.y1.o(w0Var.getContext(), null, false, false);
                            try {
                                Uri uri = Uri.parse(str);
                                strV = (uri != null && !uri.getScheme().equalsIgnoreCase("data")) ? we.e.v(uri, null, null, we.e.a(uri.getHost()), null) : str;
                            } catch (Exception e9) {
                                try {
                                    FileLog.e((Throwable) e9, false);
                                } catch (Exception e10) {
                                    e = e10;
                                    strV = str;
                                    FileLog.e(e);
                                    strDecode = strV;
                                    e3VarO.multipleLinesTitle = true;
                                    e3VarO.title = strDecode;
                                    e3VarO.bigTitle = false;
                                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                                        @Override
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i12;
                                            String str2 = str;
                                            j0 j0Var2 = j0Var;
                                            switch (i15) {
                                                case 0:
                                                    w0 w0Var2 = j0Var2.f43879a;
                                                    if (i14 == 0) {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", w0Var2.getContext().getPackageName());
                                                            w0Var2.getContext().startActivity(intent);
                                                        } catch (Exception e11) {
                                                            FileLog.e(e11);
                                                            w0Var2.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i14 == 1) {
                                                        try {
                                                            String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                            if (strGuessFileName == null) {
                                                                strGuessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) w0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            z0 z0Var = w0Var2.M;
                                                            if (z0Var != null) {
                                                                new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                            }
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    } else if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        z0 z0Var2 = w0Var2.M;
                                                        if (z0Var2 != null) {
                                                            new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    w0 w0Var3 = j0Var2.f43879a;
                                                    if (i14 == 0) {
                                                        w0Var3.loadUrl(str2);
                                                    } else if (i14 == 1) {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                            w0Var3.getContext().startActivity(intent2);
                                                        } catch (Exception e13) {
                                                            FileLog.e(e13);
                                                            w0Var3.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        z0 z0Var3 = w0Var3.M;
                                                        if (z0Var3 != null) {
                                                            new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    e3VarO.items = charSequenceArr;
                                    e3VarO.onClickListener = onClickListener;
                                    e3VarO.show();
                                    w0Var.B = e3VarO;
                                    return;
                                }
                            }
                            try {
                                strDecode = URLDecoder.decode(strV.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e11) {
                                e = e11;
                                FileLog.e(e);
                                strDecode = strV;
                            }
                            e3VarO.multipleLinesTitle = true;
                            e3VarO.title = strDecode;
                            e3VarO.bigTitle = false;
                            CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i12;
                                    String str2 = str;
                                    j0 j0Var2 = j0Var;
                                    switch (i15) {
                                        case 0:
                                            w0 w0Var2 = j0Var2.f43879a;
                                            if (i14 == 0) {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", w0Var2.getContext().getPackageName());
                                                    w0Var2.getContext().startActivity(intent);
                                                } catch (Exception e12) {
                                                    FileLog.e(e12);
                                                    w0Var2.loadUrl(str2);
                                                    return;
                                                }
                                            } else if (i14 == 1) {
                                                try {
                                                    String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                    if (strGuessFileName == null) {
                                                        strGuessFileName = "image.png";
                                                    }
                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                    request.setMimeType("image/*");
                                                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) w0Var2.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    z0 z0Var = w0Var2.M;
                                                    if (z0Var != null) {
                                                        new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                    }
                                                } catch (Exception e13) {
                                                    FileLog.e(e13);
                                                    return;
                                                }
                                            } else if (i14 == 2) {
                                                AndroidUtilities.addToClipboard(str2);
                                                z0 z0Var2 = w0Var2.M;
                                                if (z0Var2 != null) {
                                                    new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                                }
                                            }
                                            break;
                                        default:
                                            w0 w0Var3 = j0Var2.f43879a;
                                            if (i14 == 0) {
                                                w0Var3.loadUrl(str2);
                                            } else if (i14 == 1) {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                    w0Var3.getContext().startActivity(intent2);
                                                } catch (Exception e14) {
                                                    FileLog.e(e14);
                                                    w0Var3.loadUrl(str2);
                                                    return;
                                                }
                                            } else if (i14 == 2) {
                                                AndroidUtilities.addToClipboard(str2);
                                                z0 z0Var3 = w0Var3.M;
                                                if (z0Var3 != null) {
                                                    new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            };
                            e3VarO.items = charSequenceArr2;
                            e3VarO.onClickListener = onClickListener2;
                            e3VarO.show();
                            w0Var.B = e3VarO;
                            break;
                        default:
                            w0 w0Var2 = j0Var.f43879a;
                            e3 e3VarO2 = org.telegram.messenger.y1.o(w0Var2.getContext(), null, false, false);
                            try {
                                Uri uri2 = Uri.parse(str);
                                strV2 = we.e.v(uri2, null, null, we.e.a(uri2.getHost()), null);
                                break;
                            } catch (Exception e12) {
                                try {
                                    FileLog.e((Throwable) e12, false);
                                    strV2 = str;
                                } catch (Exception e13) {
                                    e = e13;
                                    strV2 = str;
                                    FileLog.e(e);
                                    strDecode2 = strV2;
                                    e3VarO2.multipleLinesTitle = true;
                                    e3VarO2.title = strDecode2;
                                    e3VarO2.bigTitle = false;
                                    CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() {
                                        @Override
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i13;
                                            String str2 = str;
                                            j0 j0Var2 = j0Var;
                                            switch (i15) {
                                                case 0:
                                                    w0 w0Var3 = j0Var2.f43879a;
                                                    if (i14 == 0) {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                            w0Var3.getContext().startActivity(intent);
                                                        } catch (Exception e14) {
                                                            FileLog.e(e14);
                                                            w0Var3.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i14 == 1) {
                                                        try {
                                                            String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                            if (strGuessFileName == null) {
                                                                strGuessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) w0Var3.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            z0 z0Var = w0Var3.M;
                                                            if (z0Var != null) {
                                                                new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                            }
                                                        } catch (Exception e15) {
                                                            FileLog.e(e15);
                                                            return;
                                                        }
                                                    } else if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        z0 z0Var2 = w0Var3.M;
                                                        if (z0Var2 != null) {
                                                            new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    w0 w0Var4 = j0Var2.f43879a;
                                                    if (i14 == 0) {
                                                        w0Var4.loadUrl(str2);
                                                    } else if (i14 == 1) {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", w0Var4.getContext().getPackageName());
                                                            w0Var4.getContext().startActivity(intent2);
                                                        } catch (Exception e16) {
                                                            FileLog.e(e16);
                                                            w0Var4.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        z0 z0Var3 = w0Var4.M;
                                                        if (z0Var3 != null) {
                                                            new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    e3VarO2.items = charSequenceArr3;
                                    e3VarO2.onClickListener = onClickListener3;
                                    e3VarO2.show();
                                    w0Var2.B = e3VarO2;
                                }
                            }
                            try {
                                strDecode2 = URLDecoder.decode(strV2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e14) {
                                e = e14;
                                FileLog.e(e);
                                strDecode2 = strV2;
                            }
                            e3VarO2.multipleLinesTitle = true;
                            e3VarO2.title = strDecode2;
                            e3VarO2.bigTitle = false;
                            CharSequence[] charSequenceArr4 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i13;
                                    String str2 = str;
                                    j0 j0Var2 = j0Var;
                                    switch (i15) {
                                        case 0:
                                            w0 w0Var3 = j0Var2.f43879a;
                                            if (i14 == 0) {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                    w0Var3.getContext().startActivity(intent);
                                                } catch (Exception e15) {
                                                    FileLog.e(e15);
                                                    w0Var3.loadUrl(str2);
                                                    return;
                                                }
                                            } else if (i14 == 1) {
                                                try {
                                                    String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                    if (strGuessFileName == null) {
                                                        strGuessFileName = "image.png";
                                                    }
                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                    request.setMimeType("image/*");
                                                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) w0Var3.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    z0 z0Var = w0Var3.M;
                                                    if (z0Var != null) {
                                                        new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                    }
                                                } catch (Exception e16) {
                                                    FileLog.e(e16);
                                                    return;
                                                }
                                            } else if (i14 == 2) {
                                                AndroidUtilities.addToClipboard(str2);
                                                z0 z0Var2 = w0Var3.M;
                                                if (z0Var2 != null) {
                                                    new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                                }
                                            }
                                            break;
                                        default:
                                            w0 w0Var4 = j0Var2.f43879a;
                                            if (i14 == 0) {
                                                w0Var4.loadUrl(str2);
                                            } else if (i14 == 1) {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", w0Var4.getContext().getPackageName());
                                                    w0Var4.getContext().startActivity(intent2);
                                                } catch (Exception e17) {
                                                    FileLog.e(e17);
                                                    w0Var4.loadUrl(str2);
                                                    return;
                                                }
                                            } else if (i14 == 2) {
                                                AndroidUtilities.addToClipboard(str2);
                                                z0 z0Var3 = w0Var4.M;
                                                if (z0Var3 != null) {
                                                    new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            };
                            e3VarO2.items = charSequenceArr4;
                            e3VarO2.onClickListener = onClickListener4;
                            e3VarO2.show();
                            w0Var2.B = e3VarO2;
                            break;
                    }
                }
            });
            return true;
        }
        if (hitTestResult.getType() != 5) {
            return false;
        }
        final String extra2 = hitTestResult.getExtra();
        final int i11 = 1;
        AndroidUtilities.runOnUIThread(new Runnable(this) {

            public final j0 f43846b;

            {
                this.f43846b = this;
            }

            @Override
            public final void run() {
                String strV;
                String strDecode;
                String strV2;
                String strDecode2;
                int i12 = i11;
                final String str = extra2;
                final j0 j0Var = this.f43846b;
                final int i13 = 1;
                final int i14 = 0;
                switch (i12) {
                    case 0:
                        w0 w0Var = j0Var.f43879a;
                        e3 e3VarO = org.telegram.messenger.y1.o(w0Var.getContext(), null, false, false);
                        try {
                            Uri uri = Uri.parse(str);
                            strV = (uri != null && !uri.getScheme().equalsIgnoreCase("data")) ? we.e.v(uri, null, null, we.e.a(uri.getHost()), null) : str;
                        } catch (Exception e9) {
                            try {
                                FileLog.e((Throwable) e9, false);
                            } catch (Exception e10) {
                                e = e10;
                                strV = str;
                                FileLog.e(e);
                                strDecode = strV;
                                e3VarO.multipleLinesTitle = true;
                                e3VarO.title = strDecode;
                                e3VarO.bigTitle = false;
                                CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                                    @Override
                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                        int i16 = i13;
                                        String str2 = str;
                                        j0 j0Var2 = j0Var;
                                        switch (i16) {
                                            case 0:
                                                w0 w0Var3 = j0Var2.f43879a;
                                                if (i15 == 0) {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                        w0Var3.getContext().startActivity(intent);
                                                    } catch (Exception e15) {
                                                        FileLog.e(e15);
                                                        w0Var3.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i15 == 1) {
                                                    try {
                                                        String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                        if (strGuessFileName == null) {
                                                            strGuessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) w0Var3.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        z0 z0Var = w0Var3.M;
                                                        if (z0Var != null) {
                                                            new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                        }
                                                    } catch (Exception e16) {
                                                        FileLog.e(e16);
                                                        return;
                                                    }
                                                } else if (i15 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    z0 z0Var2 = w0Var3.M;
                                                    if (z0Var2 != null) {
                                                        new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                                    }
                                                }
                                                break;
                                            default:
                                                w0 w0Var4 = j0Var2.f43879a;
                                                if (i15 == 0) {
                                                    w0Var4.loadUrl(str2);
                                                } else if (i15 == 1) {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", w0Var4.getContext().getPackageName());
                                                        w0Var4.getContext().startActivity(intent2);
                                                    } catch (Exception e17) {
                                                        FileLog.e(e17);
                                                        w0Var4.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i15 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    z0 z0Var3 = w0Var4.M;
                                                    if (z0Var3 != null) {
                                                        new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                e3VarO.items = charSequenceArr2;
                                e3VarO.onClickListener = onClickListener2;
                                e3VarO.show();
                                w0Var.B = e3VarO;
                                return;
                            }
                        }
                        try {
                            strDecode = URLDecoder.decode(strV.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            strDecode = strV;
                        }
                        e3VarO.multipleLinesTitle = true;
                        e3VarO.title = strDecode;
                        e3VarO.bigTitle = false;
                        CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                        DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                int i16 = i13;
                                String str2 = str;
                                j0 j0Var2 = j0Var;
                                switch (i16) {
                                    case 0:
                                        w0 w0Var3 = j0Var2.f43879a;
                                        if (i15 == 0) {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                w0Var3.getContext().startActivity(intent);
                                            } catch (Exception e15) {
                                                FileLog.e(e15);
                                                w0Var3.loadUrl(str2);
                                                return;
                                            }
                                        } else if (i15 == 1) {
                                            try {
                                                String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                if (strGuessFileName == null) {
                                                    strGuessFileName = "image.png";
                                                }
                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                request.setMimeType("image/*");
                                                request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                request.setNotificationVisibility(1);
                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                DownloadManager downloadManager = (DownloadManager) w0Var3.getContext().getSystemService("download");
                                                if (downloadManager != null) {
                                                    downloadManager.enqueue(request);
                                                }
                                                z0 z0Var = w0Var3.M;
                                                if (z0Var != null) {
                                                    new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                }
                                            } catch (Exception e16) {
                                                FileLog.e(e16);
                                                return;
                                            }
                                        } else if (i15 == 2) {
                                            AndroidUtilities.addToClipboard(str2);
                                            z0 z0Var2 = w0Var3.M;
                                            if (z0Var2 != null) {
                                                new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                            }
                                        }
                                        break;
                                    default:
                                        w0 w0Var4 = j0Var2.f43879a;
                                        if (i15 == 0) {
                                            w0Var4.loadUrl(str2);
                                        } else if (i15 == 1) {
                                            try {
                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                intent2.putExtra("create_new_tab", true);
                                                intent2.putExtra("com.android.browser.application_id", w0Var4.getContext().getPackageName());
                                                w0Var4.getContext().startActivity(intent2);
                                            } catch (Exception e17) {
                                                FileLog.e(e17);
                                                w0Var4.loadUrl(str2);
                                                return;
                                            }
                                        } else if (i15 == 2) {
                                            AndroidUtilities.addToClipboard(str2);
                                            z0 z0Var3 = w0Var4.M;
                                            if (z0Var3 != null) {
                                                new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                        e3VarO.items = charSequenceArr3;
                        e3VarO.onClickListener = onClickListener3;
                        e3VarO.show();
                        w0Var.B = e3VarO;
                        break;
                    default:
                        w0 w0Var2 = j0Var.f43879a;
                        e3 e3VarO2 = org.telegram.messenger.y1.o(w0Var2.getContext(), null, false, false);
                        try {
                            Uri uri2 = Uri.parse(str);
                            strV2 = we.e.v(uri2, null, null, we.e.a(uri2.getHost()), null);
                            break;
                        } catch (Exception e12) {
                            try {
                                FileLog.e((Throwable) e12, false);
                                strV2 = str;
                            } catch (Exception e13) {
                                e = e13;
                                strV2 = str;
                                FileLog.e(e);
                                strDecode2 = strV2;
                                e3VarO2.multipleLinesTitle = true;
                                e3VarO2.title = strDecode2;
                                e3VarO2.bigTitle = false;
                                CharSequence[] charSequenceArr4 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() {
                                    @Override
                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                        int i16 = i14;
                                        String str2 = str;
                                        j0 j0Var2 = j0Var;
                                        switch (i16) {
                                            case 0:
                                                w0 w0Var3 = j0Var2.f43879a;
                                                if (i15 == 0) {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                        w0Var3.getContext().startActivity(intent);
                                                    } catch (Exception e15) {
                                                        FileLog.e(e15);
                                                        w0Var3.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i15 == 1) {
                                                    try {
                                                        String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                        if (strGuessFileName == null) {
                                                            strGuessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) w0Var3.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        z0 z0Var = w0Var3.M;
                                                        if (z0Var != null) {
                                                            new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                        }
                                                    } catch (Exception e16) {
                                                        FileLog.e(e16);
                                                        return;
                                                    }
                                                } else if (i15 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    z0 z0Var2 = w0Var3.M;
                                                    if (z0Var2 != null) {
                                                        new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                                    }
                                                }
                                                break;
                                            default:
                                                w0 w0Var4 = j0Var2.f43879a;
                                                if (i15 == 0) {
                                                    w0Var4.loadUrl(str2);
                                                } else if (i15 == 1) {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", w0Var4.getContext().getPackageName());
                                                        w0Var4.getContext().startActivity(intent2);
                                                    } catch (Exception e17) {
                                                        FileLog.e(e17);
                                                        w0Var4.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i15 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    z0 z0Var3 = w0Var4.M;
                                                    if (z0Var3 != null) {
                                                        new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                e3VarO2.items = charSequenceArr4;
                                e3VarO2.onClickListener = onClickListener4;
                                e3VarO2.show();
                                w0Var2.B = e3VarO2;
                            }
                        }
                        try {
                            strDecode2 = URLDecoder.decode(strV2.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e14) {
                            e = e14;
                            FileLog.e(e);
                            strDecode2 = strV2;
                        }
                        e3VarO2.multipleLinesTitle = true;
                        e3VarO2.title = strDecode2;
                        e3VarO2.bigTitle = false;
                        CharSequence[] charSequenceArr5 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                        DialogInterface.OnClickListener onClickListener5 = new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                int i16 = i14;
                                String str2 = str;
                                j0 j0Var2 = j0Var;
                                switch (i16) {
                                    case 0:
                                        w0 w0Var3 = j0Var2.f43879a;
                                        if (i15 == 0) {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", w0Var3.getContext().getPackageName());
                                                w0Var3.getContext().startActivity(intent);
                                            } catch (Exception e15) {
                                                FileLog.e(e15);
                                                w0Var3.loadUrl(str2);
                                                return;
                                            }
                                        } else if (i15 == 1) {
                                            try {
                                                String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                if (strGuessFileName == null) {
                                                    strGuessFileName = "image.png";
                                                }
                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                request.setMimeType("image/*");
                                                request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                request.setNotificationVisibility(1);
                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                DownloadManager downloadManager = (DownloadManager) w0Var3.getContext().getSystemService("download");
                                                if (downloadManager != null) {
                                                    downloadManager.enqueue(request);
                                                }
                                                z0 z0Var = w0Var3.M;
                                                if (z0Var != null) {
                                                    new mc(z0Var, z0Var.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).k(true);
                                                }
                                            } catch (Exception e16) {
                                                FileLog.e(e16);
                                                return;
                                            }
                                        } else if (i15 == 2) {
                                            AndroidUtilities.addToClipboard(str2);
                                            z0 z0Var2 = w0Var3.M;
                                            if (z0Var2 != null) {
                                                new mc(z0Var2, z0Var2.f44064e).k(false).k(true);
                                            }
                                        }
                                        break;
                                    default:
                                        w0 w0Var4 = j0Var2.f43879a;
                                        if (i15 == 0) {
                                            w0Var4.loadUrl(str2);
                                        } else if (i15 == 1) {
                                            try {
                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                intent2.putExtra("create_new_tab", true);
                                                intent2.putExtra("com.android.browser.application_id", w0Var4.getContext().getPackageName());
                                                w0Var4.getContext().startActivity(intent2);
                                            } catch (Exception e17) {
                                                FileLog.e(e17);
                                                w0Var4.loadUrl(str2);
                                                return;
                                            }
                                        } else if (i15 == 2) {
                                            AndroidUtilities.addToClipboard(str2);
                                            z0 z0Var3 = w0Var4.M;
                                            if (z0Var3 != null) {
                                                new mc(z0Var3, z0Var3.f44064e).k(false).k(true);
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                        e3VarO2.items = charSequenceArr5;
                        e3VarO2.onClickListener = onClickListener5;
                        e3VarO2.show();
                        w0Var2.B = e3VarO2;
                        break;
                }
            }
        });
        return true;
    }
}
