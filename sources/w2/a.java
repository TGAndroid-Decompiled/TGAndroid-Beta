package w2;

import i7.j8;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import v2.c;
import y2.k;
public final class a implements k {
    public static final String f49621c;
    public static final Set d;
    public static final a f49622e;
    public static final a f49623f;
    public final String f49624a;
    public final String f49625b;

    static {
        String a2 = j8.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f49621c = a2;
        String a10 = j8.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a11 = j8.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f49622e = new a(a2, null);
        f49623f = new a(a10, a11);
    }

    public a(String str, String str2) {
        this.f49624a = str;
        this.f49625b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
