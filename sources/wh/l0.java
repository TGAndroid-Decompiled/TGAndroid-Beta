package wh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l0 {
    public static ArrayList d;
    public final int f49846a;
    public final String f49847b;
    public final List f49848c;

    public l0(int i10, String str, String... strArr) {
        this.f49846a = i10;
        this.f49847b = str;
        this.f49848c = Arrays.asList(strArr);
    }

    public static ArrayList a(String str) {
        String trim;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (trim.startsWith("/")) {
            trim = trim.substring(1);
        }
        String lowerCase = trim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            ArrayList arrayList3 = new ArrayList();
            d = arrayList3;
            arrayList3.add(new l0(R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new l0(R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), "##", "/h2"));
            d.add(new l0(R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), "###", "/h3"));
            d.add(new l0(R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), "####", "/h4"));
            d.add(new l0(R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), "#####", "/h5"));
            d.add(new l0(R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), "######", "/h6"));
            d.add(new l0(R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), "|", "/quote"));
            d.add(new l0(R.drawable.iv_pullquote, LocaleController.getString(R.string.ArticlePullquote), "/pullquote"));
            d.add(new l0(R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), "```", "/code", "/pre", "/preformatted"));
            d.add(new l0(R.drawable.iv_footer, LocaleController.getString(R.string.ArticleFooter), "/footer"));
            d.add(new l0(R.drawable.iv_list, LocaleController.getString(R.string.ArticleCommandList), "-", "/list"));
            d.add(new l0(R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleCommandOrderedList), "1."));
            d.add(new l0(R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListChecklist), "[]", "/todo", "/checklist"));
            d.add(new l0(R.drawable.iv_details, LocaleController.getString(R.string.ArticleCommandToggle), ">", "/toggle", "/details"));
            d.add(new l0(R.drawable.iv_button, LocaleController.getString(R.string.RichEditorButton), "/button"));
            d.add(new l0(R.drawable.iv_table, LocaleController.getString(R.string.ArticleCommandTable), "/table"));
            d.add(new l0(R.drawable.iv_math, LocaleController.getString(R.string.ArticleCommandMath), "/math", "/latex", "/expression"));
            d.add(new l0(R.drawable.iv_divider, LocaleController.getString(R.string.ArticleCommandDivider), "---"));
            d.add(new l0(R.drawable.iv_media, LocaleController.getString(R.string.ArticleCommandImage), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new l0(R.drawable.iv_media, LocaleController.getString(R.string.ArticleCommandVideo), "/video", "/vid", "/media"));
            d.add(new l0(R.drawable.iv_audio, LocaleController.getString(R.string.ArticleCommandAudio), "/audio", "/music", "/media"));
            d.add(new l0(R.drawable.iv_location, LocaleController.getString(R.string.ArticleCommandMap), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = l0Var.f49847b.toLowerCase().split(" ");
                int length = split.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (split[i11].startsWith(lowerCase)) {
                            break;
                        }
                        i11++;
                    } else {
                        for (String str2 : l0Var.f49848c) {
                            String lowerCase2 = str2.toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                    }
                }
            }
            arrayList.add(l0Var);
        }
        return arrayList;
    }
}
