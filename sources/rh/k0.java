package rh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class k0 {
    public static ArrayList d;

    public final int f47229a;

    public final String f47230b;

    public final List f47231c;

    public k0(int i10, String str, String... strArr) {
        this.f47229a = i10;
        this.f47230b = str;
        this.f47231c = Arrays.asList(strArr);
    }

    public static ArrayList a(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.startsWith("/")) {
            strTrim = strTrim.substring(1);
        }
        String lowerCase = strTrim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            ArrayList arrayList3 = new ArrayList();
            d = arrayList3;
            arrayList3.add(new k0(R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new k0(R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), "##", "/h2"));
            d.add(new k0(R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), "###", "/h3"));
            d.add(new k0(R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), "####", "/h4"));
            d.add(new k0(R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), "#####", "/h5"));
            d.add(new k0(R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), "######", "/h6"));
            d.add(new k0(R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), "|", "/quote"));
            d.add(new k0(R.drawable.iv_pullquote, LocaleController.getString(R.string.ArticlePullquote), "/pullquote"));
            d.add(new k0(R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), "```", "/code", "/pre", "/preformatted"));
            d.add(new k0(R.drawable.iv_footer, LocaleController.getString(R.string.ArticleFooter), "/footer"));
            d.add(new k0(R.drawable.iv_list, LocaleController.getString(R.string.ArticleCommandList), "-", "/list"));
            d.add(new k0(R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleCommandOrderedList), "1."));
            d.add(new k0(R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListChecklist), "[]", "/todo", "/checklist"));
            d.add(new k0(R.drawable.iv_details, LocaleController.getString(R.string.ArticleCommandToggle), ">", "/toggle", "/details"));
            d.add(new k0(R.drawable.iv_button, LocaleController.getString(R.string.RichEditorButton), "/button"));
            d.add(new k0(R.drawable.iv_table, LocaleController.getString(R.string.ArticleCommandTable), "/table"));
            d.add(new k0(R.drawable.iv_math, LocaleController.getString(R.string.ArticleCommandMath), "/math", "/latex", "/expression"));
            d.add(new k0(R.drawable.iv_divider, LocaleController.getString(R.string.ArticleCommandDivider), "---"));
            d.add(new k0(R.drawable.iv_media, LocaleController.getString(R.string.ArticleCommandImage), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new k0(R.drawable.iv_media, LocaleController.getString(R.string.ArticleCommandVideo), "/video", "/vid", "/media"));
            d.add(new k0(R.drawable.iv_audio, LocaleController.getString(R.string.ArticleCommandAudio), "/audio", "/music", "/media"));
            d.add(new k0(R.drawable.iv_location, LocaleController.getString(R.string.ArticleCommandMap), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            if (!lowerCase.isEmpty()) {
                String[] strArrSplit = k0Var.f47230b.toLowerCase().split(" ");
                int length = strArrSplit.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        Iterator it = k0Var.f47231c.iterator();
                        while (it.hasNext()) {
                            String lowerCase2 = ((String) it.next()).toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                        break;
                    }
                    if (!strArrSplit[i11].startsWith(lowerCase)) {
                        i11++;
                    }
                }
            }
            arrayList.add(k0Var);
        }
        return arrayList;
    }
}
