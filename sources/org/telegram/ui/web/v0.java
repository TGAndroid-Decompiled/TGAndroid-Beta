package org.telegram.ui.web;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;

public final class v0 implements DownloadListener {

    public final w0 f44016a;

    public v0(w0 w0Var) {
        this.f44016a = w0Var;
    }

    @Override
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        String strGuessFileName;
        StringBuilder sbP = i0.a.p("onDownloadStart ", str, " ", str2, " ");
        i0.a.z(sbP, str3, " ", str4, " ");
        sbP.append(j10);
        String string = sbP.toString();
        w0 w0Var = this.f44016a;
        w0Var.c(string);
        try {
            if (str.startsWith("blob:")) {
                return;
            }
            try {
                List<String> pathSegments = Uri.parse(str).getPathSegments();
                strGuessFileName = pathSegments.get(pathSegments.size() - 1);
                int iLastIndexOf = strGuessFileName.lastIndexOf(".");
                if (iLastIndexOf <= 0 || TextUtils.isEmpty(strGuessFileName.substring(iLastIndexOf + 1))) {
                    strGuessFileName = URLUtil.guessFileName(str, str3, str4);
                }
            } catch (Exception unused) {
            }
            String strEscape = AndroidUtilities.escape(strGuessFileName);
            z zVar = new z(this, str, str4, str2, strEscape, 2);
            if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j10)) {
                zVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w0Var.getContext());
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = LocaleController.getString(R.string.WebDownloadAlertTitle);
            b2Var.P = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, strEscape, AndroidUtilities.formatFileSize(j10)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, strEscape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new lh.p(zVar, 14));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-2);
            if (textView != null) {
                textView.setTextColor(g6.w0(null, g6.f23284q7, false));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
