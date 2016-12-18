/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package intellij.haskell.cabal.highlighting;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import intellij.haskell.cabal.lang.psi.CabalTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_CabalSyntaxHighlightingLexer.flex</tt>
 */
public class _CabalSyntaxHighlightingLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1672 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\77\1\1\3\275\1");

  /* The ZZ_CMAP_A table has 512 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\5\14\0\1\7\2\0\12\4\1\6\6\0\1\15\1\16\1\12"+
    "\1\4\1\10\1\33\1\34\1\25\1\21\1\4\1\30\1\17\1\26\1\24\1\35\1\36\1\4\1\22\1"+
    "\32\1\14\1\13\2\4\1\11\1\23\1\4\6\0\1\15\1\16\1\12\1\4\1\10\1\33\1\34\1\25"+
    "\1\21\1\4\1\30\1\17\1\26\1\24\1\35\1\36\1\4\1\22\1\32\1\14\1\13\2\4\1\11\1"+
    "\23\1\4\265\0\2\20\115\0\1\31\52\0\1\27\125\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\1\1\4\12\1\4\5"+
    "\2\0\1\6\1\7\26\0\1\10\10\0\3\11\1\6"+
    "\4\0\1\12\13\0\2\11\7\0\1\13\10\0\1\12"+
    "\13\0\2\13\1\6\1\0\1\12\123\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\76\0\135\0\174\0\233\0\76"+
    "\0\272\0\331\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193"+
    "\0\u01b2\0\u01d1\0\76\0\u01f0\0\u020f\0\u022e\0\233\0\u024d"+
    "\0\76\0\u026c\0\u028b\0\u02aa\0\u02c9\0\u02e8\0\u0307\0\u0326"+
    "\0\u0345\0\u0364\0\u0383\0\u03a2\0\u03c1\0\u01f0\0\u03e0\0\u03ff"+
    "\0\u041e\0\u043d\0\u045c\0\u047b\0\u049a\0\u04b9\0\u04d8\0\u04f7"+
    "\0\u0516\0\u0535\0\u0554\0\u0573\0\u0592\0\u05b1\0\u05d0\0\u05ef"+
    "\0\u060e\0\u0345\0\u0364\0\u062d\0\u0345\0\u064c\0\u066b\0\u068a"+
    "\0\u06a9\0\76\0\u06c8\0\u06e7\0\u0706\0\u0725\0\u0744\0\u0763"+
    "\0\u0782\0\u07a1\0\u07c0\0\u07df\0\u07fe\0\76\0\233\0\u081d"+
    "\0\u083c\0\u085b\0\u087a\0\u0899\0\u08b8\0\u08d7\0\u08f6\0\u0915"+
    "\0\u0934\0\u0953\0\u0972\0\u0991\0\u09b0\0\u09cf\0\u09ee\0\u0782"+
    "\0\u0a0d\0\u0a2c\0\u0a4b\0\u0a6a\0\u0a89\0\u0aa8\0\u0ac7\0\u0ae6"+
    "\0\u0b05\0\u0b24\0\u0b43\0\u0b62\0\u0b81\0\u0b62\0\u0ba0\0\u03e0"+
    "\0\u0bbf\0\u0bde\0\u0bfd\0\u0c1c\0\u0c3b\0\u0c5a\0\u0c79\0\u0c98"+
    "\0\u0cb7\0\u0cd6\0\u0cf5\0\u0d14\0\u0d33\0\u0d52\0\u0d71\0\u0d90"+
    "\0\u0daf\0\u0dce\0\u0ded\0\u0e0c\0\u0e2b\0\u0e4a\0\u0e69\0\u0e88"+
    "\0\u0ea7\0\u0ec6\0\u0ee5\0\u0f04\0\u0f23\0\u0f42\0\u0f61\0\u0f80"+
    "\0\u0f9f\0\u0fbe\0\u0fdd\0\u0ffc\0\u101b\0\u103a\0\u1059\0\u1078"+
    "\0\u1097\0\u10b6\0\u10d5\0\u10f4\0\u1113\0\u1132\0\u1151\0\u1170"+
    "\0\u118f\0\u11ae\0\u11cd\0\u11ec\0\u120b\0\u122a\0\u1249\0\u1268"+
    "\0\u1287\0\u12a6\0\u12c5\0\u12e4\0\u1303\0\u1322\0\u1341\0\u1360"+
    "\0\u137f\0\u139e\0\u13bd\0\u13dc\0\u13fb\0\u141a\0\u1439\0\u1458"+
    "\0\u1477\0\u1496\0\u14b5\0\u14d4\0\u14f3\0\u1512\0\u1531\0\u1550"+
    "\0\u156f\0\u158e\0\u15ad";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\6\1\10\1\11"+
    "\1\12\3\7\1\13\1\7\1\14\1\15\1\16\1\17"+
    "\5\7\1\3\1\7\1\20\1\21\1\22\3\7\1\23"+
    "\1\24\1\25\4\23\1\26\27\23\40\0\1\4\40\0"+
    "\1\6\1\0\1\6\35\0\1\27\1\30\1\31\11\27"+
    "\1\0\6\27\1\0\1\27\1\0\5\27\4\0\1\27"+
    "\1\30\1\31\1\32\10\27\1\0\6\27\1\0\1\27"+
    "\1\0\5\27\4\0\1\27\1\30\1\31\2\27\1\33"+
    "\5\27\1\34\1\0\6\27\1\0\1\27\1\0\5\27"+
    "\4\0\1\27\1\30\1\31\1\27\1\35\7\27\1\0"+
    "\6\27\1\0\1\27\1\0\5\27\4\0\1\27\1\30"+
    "\1\31\1\27\1\36\7\27\1\0\6\27\1\0\1\27"+
    "\1\0\5\27\4\0\1\27\1\30\1\31\11\27\1\37"+
    "\1\40\5\27\1\0\1\27\1\0\5\27\33\0\1\41"+
    "\7\0\1\27\1\30\1\31\11\27\1\0\6\27\1\0"+
    "\1\27\1\0\1\27\1\42\3\27\35\0\1\43\5\0"+
    "\1\27\1\30\1\31\11\27\1\0\6\27\1\0\1\27"+
    "\1\0\3\27\1\44\1\27\4\0\1\27\1\30\1\31"+
    "\10\27\1\45\1\0\6\27\1\0\1\27\1\0\5\27"+
    "\3\0\1\46\1\47\1\46\1\0\1\47\1\50\3\47"+
    "\1\51\1\47\1\52\1\53\1\54\1\55\5\47\1\0"+
    "\1\47\1\56\1\57\1\60\3\47\1\0\1\46\1\0"+
    "\1\46\1\47\1\46\1\0\1\47\1\50\3\47\1\51"+
    "\1\47\1\52\1\53\1\54\1\55\5\47\1\0\1\47"+
    "\1\56\1\57\1\60\3\47\7\0\1\61\34\0\1\30"+
    "\1\31\30\0\1\32\2\0\34\32\4\0\1\27\1\30"+
    "\1\31\1\27\1\62\7\27\1\0\6\27\1\0\1\27"+
    "\1\0\5\27\4\0\1\27\1\30\1\31\11\27\1\0"+
    "\6\27\1\0\1\27\1\63\1\64\4\27\4\0\1\27"+
    "\1\30\1\31\11\27\1\0\6\27\1\0\1\27\1\65"+
    "\1\66\4\27\4\0\1\27\1\30\1\31\11\27\1\0"+
    "\3\27\1\67\2\27\1\0\1\27\1\0\5\27\16\0"+
    "\1\70\24\0\1\27\1\30\1\31\7\27\1\71\1\27"+
    "\1\0\6\27\1\0\1\27\1\0\5\27\1\72\2\0"+
    "\35\72\2\0\1\72\1\73\1\74\1\75\11\73\1\72"+
    "\6\73\1\72\1\73\1\72\5\73\13\0\1\76\27\0"+
    "\1\27\1\30\1\31\4\27\1\77\4\27\1\0\6\27"+
    "\1\0\1\27\1\0\5\27\4\0\1\27\1\30\1\31"+
    "\6\27\1\100\2\27\1\0\6\27\1\0\1\27\1\0"+
    "\5\27\4\0\1\47\1\101\1\102\11\47\1\0\6\47"+
    "\1\0\1\47\1\0\5\47\4\0\1\47\1\101\1\102"+
    "\2\47\1\103\5\47\1\104\1\0\6\47\1\0\1\47"+
    "\1\0\5\47\4\0\1\47\1\101\1\102\1\47\1\105"+
    "\7\47\1\0\6\47\1\0\1\47\1\0\5\47\4\0"+
    "\1\47\1\101\1\102\1\47\1\106\7\47\1\0\6\47"+
    "\1\0\1\47\1\0\5\47\4\0\1\47\1\101\1\102"+
    "\11\47\1\107\1\110\5\47\1\0\1\47\1\0\5\47"+
    "\33\0\1\111\7\0\1\47\1\101\1\102\11\47\1\0"+
    "\6\47\1\0\1\47\1\0\1\47\1\111\3\47\35\0"+
    "\1\112\5\0\1\47\1\101\1\102\11\47\1\0\6\47"+
    "\1\0\1\47\1\0\3\47\1\113\1\47\4\0\1\47"+
    "\1\101\1\102\10\47\1\114\1\0\6\47\1\0\1\47"+
    "\1\0\5\47\1\61\2\0\34\61\4\0\1\27\1\30"+
    "\1\31\3\27\1\115\5\27\1\0\6\27\1\0\1\27"+
    "\1\0\5\27\10\0\1\116\32\0\1\27\1\30\1\31"+
    "\1\27\1\117\7\27\1\0\6\27\1\0\1\27\1\0"+
    "\5\27\14\0\1\120\26\0\1\27\1\30\1\31\5\27"+
    "\1\121\3\27\1\0\6\27\1\0\1\27\1\0\5\27"+
    "\4\0\1\27\1\30\1\31\3\27\1\122\5\27\1\0"+
    "\6\27\1\0\1\27\1\0\5\27\22\0\1\123\20\0"+
    "\1\27\1\30\1\31\11\27\1\0\1\27\1\124\4\27"+
    "\1\0\1\27\1\0\5\27\1\72\2\0\2\72\1\74"+
    "\1\75\30\72\22\0\1\125\20\0\1\27\1\30\1\31"+
    "\11\27\1\0\1\27\1\126\4\27\1\0\1\27\1\0"+
    "\5\27\4\0\1\27\1\30\1\31\11\27\1\0\6\27"+
    "\1\0\1\27\1\0\2\27\1\127\2\27\5\0\1\101"+
    "\1\102\34\0\1\47\1\101\1\102\1\47\1\130\7\47"+
    "\1\0\6\47\1\0\1\47\1\0\5\47\4\0\1\47"+
    "\1\101\1\102\11\47\1\0\6\47\1\0\1\47\1\131"+
    "\1\132\4\47\4\0\1\47\1\101\1\102\11\47\1\0"+
    "\6\47\1\0\1\47\1\133\1\134\4\47\4\0\1\47"+
    "\1\101\1\102\11\47\1\0\3\47\1\135\2\47\1\0"+
    "\1\47\1\0\5\47\16\0\1\136\24\0\1\47\1\101"+
    "\1\102\7\47\1\137\1\47\1\0\6\47\1\0\1\47"+
    "\1\0\5\47\1\140\2\0\34\140\13\0\1\141\27\0"+
    "\1\47\1\101\1\102\4\47\1\142\4\47\1\0\6\47"+
    "\1\0\1\47\1\0\5\47\4\0\1\47\1\101\1\102"+
    "\6\47\1\143\2\47\1\0\6\47\1\0\1\47\1\0"+
    "\5\47\4\0\1\27\1\30\1\31\4\27\1\144\4\27"+
    "\1\0\6\27\1\0\1\27\1\0\5\27\7\0\1\145"+
    "\33\0\1\27\1\30\1\31\1\146\10\27\1\0\6\27"+
    "\1\0\1\27\1\0\5\27\4\0\1\27\1\30\1\31"+
    "\11\27\1\0\4\27\1\147\1\27\1\0\1\27\1\0"+
    "\5\27\15\0\1\150\25\0\1\27\1\30\1\31\6\27"+
    "\1\151\2\27\1\0\6\27\1\0\1\27\1\0\5\27"+
    "\12\0\1\152\30\0\1\27\1\30\1\31\3\27\1\153"+
    "\5\27\1\0\6\27\1\0\1\27\1\0\5\27\1\154"+
    "\2\0\1\154\1\127\1\155\1\156\11\127\1\154\6\127"+
    "\1\154\1\127\1\154\5\127\4\0\1\47\1\101\1\102"+
    "\3\47\1\157\5\47\1\0\6\47\1\0\1\47\1\0"+
    "\5\47\10\0\1\102\32\0\1\47\1\101\1\102\1\47"+
    "\1\160\7\47\1\0\6\47\1\0\1\47\1\0\5\47"+
    "\14\0\1\161\26\0\1\47\1\101\1\102\5\47\1\162"+
    "\3\47\1\0\6\47\1\0\1\47\1\0\5\47\4\0"+
    "\1\47\1\101\1\102\3\47\1\163\5\47\1\0\6\47"+
    "\1\0\1\47\1\0\5\47\22\0\1\164\20\0\1\47"+
    "\1\101\1\102\11\47\1\0\1\47\1\165\4\47\1\0"+
    "\1\47\1\0\5\47\22\0\1\166\20\0\1\47\1\101"+
    "\1\102\11\47\1\0\1\47\1\167\4\47\1\0\1\47"+
    "\1\0\5\47\4\0\1\47\1\101\1\102\11\47\1\0"+
    "\6\47\1\0\1\47\1\0\2\47\1\140\2\47\4\0"+
    "\1\27\1\30\1\31\5\27\1\170\3\27\1\0\6\27"+
    "\1\0\1\27\1\0\5\27\31\0\2\171\10\0\1\27"+
    "\1\30\1\31\11\27\1\0\6\27\1\0\1\27\1\171"+
    "\1\172\4\27\4\0\1\27\1\30\1\31\11\27\1\0"+
    "\5\27\1\173\1\0\1\27\1\0\5\27\22\0\1\174"+
    "\20\0\1\27\1\30\1\31\11\27\1\0\1\27\1\175"+
    "\4\27\1\0\1\27\1\0\5\27\10\0\1\176\32\0"+
    "\1\27\1\30\1\31\1\27\1\177\7\27\1\0\6\27"+
    "\1\0\1\27\1\0\5\27\1\154\2\0\35\154\2\0"+
    "\2\154\1\155\1\156\30\154\4\0\1\47\1\101\1\102"+
    "\4\47\1\200\4\47\1\0\6\47\1\0\1\47\1\0"+
    "\5\47\7\0\1\201\33\0\1\47\1\101\1\102\1\202"+
    "\10\47\1\0\6\47\1\0\1\47\1\0\5\47\4\0"+
    "\1\47\1\101\1\102\11\47\1\0\4\47\1\203\1\47"+
    "\1\0\1\47\1\0\5\47\15\0\1\204\25\0\1\47"+
    "\1\101\1\102\6\47\1\205\2\47\1\0\6\47\1\0"+
    "\1\47\1\0\5\47\12\0\1\206\30\0\1\47\1\101"+
    "\1\102\3\47\1\207\5\47\1\0\6\47\1\0\1\47"+
    "\1\0\5\47\4\0\1\27\1\30\1\31\6\27\1\210"+
    "\2\27\1\0\6\27\1\0\1\27\1\0\5\27\13\0"+
    "\1\211\27\0\1\27\1\30\1\31\4\27\1\212\4\27"+
    "\1\0\6\27\1\0\1\27\1\0\5\27\4\0\1\27"+
    "\1\30\1\31\6\27\1\213\2\27\1\0\6\27\1\0"+
    "\1\27\1\0\5\27\23\0\1\154\17\0\1\27\1\30"+
    "\1\31\11\27\1\0\2\27\1\127\3\27\1\0\1\27"+
    "\1\0\5\27\7\0\1\214\33\0\1\27\1\30\1\31"+
    "\1\215\10\27\1\0\6\27\1\0\1\27\1\0\5\27"+
    "\4\0\1\47\1\101\1\102\5\47\1\216\3\47\1\0"+
    "\6\47\1\0\1\47\1\0\5\47\31\0\2\217\10\0"+
    "\1\47\1\101\1\102\11\47\1\0\6\47\1\0\1\47"+
    "\1\217\1\220\4\47\4\0\1\47\1\101\1\102\11\47"+
    "\1\0\5\47\1\221\1\0\1\47\1\0\5\47\22\0"+
    "\1\222\20\0\1\47\1\101\1\102\11\47\1\0\1\47"+
    "\1\223\4\47\1\0\1\47\1\0\5\47\10\0\1\224"+
    "\32\0\1\47\1\101\1\102\1\47\1\225\7\47\1\0"+
    "\6\47\1\0\1\47\1\0\5\47\4\0\1\27\1\30"+
    "\1\31\7\27\1\226\1\27\1\0\6\27\1\0\1\27"+
    "\1\0\5\27\20\0\2\227\21\0\1\27\1\30\1\31"+
    "\11\27\1\227\1\230\5\27\1\0\1\27\1\0\5\27"+
    "\4\0\1\27\1\30\1\31\11\27\1\0\1\27\1\231"+
    "\4\27\1\0\1\27\1\0\5\27\22\0\1\232\20\0"+
    "\1\27\1\30\1\31\11\27\1\0\1\27\1\233\4\27"+
    "\1\0\1\27\1\0\5\27\4\0\1\47\1\101\1\102"+
    "\6\47\1\234\2\47\1\0\6\47\1\0\1\47\1\0"+
    "\5\47\13\0\1\235\27\0\1\47\1\101\1\102\4\47"+
    "\1\236\4\47\1\0\6\47\1\0\1\47\1\0\5\47"+
    "\4\0\1\47\1\101\1\102\6\47\1\237\2\47\1\0"+
    "\6\47\1\0\1\47\1\0\5\47\23\0\1\140\17\0"+
    "\1\47\1\101\1\102\11\47\1\0\2\47\1\140\3\47"+
    "\1\0\1\47\1\0\5\47\7\0\1\240\33\0\1\47"+
    "\1\101\1\102\1\241\10\47\1\0\6\47\1\0\1\47"+
    "\1\0\5\47\4\0\1\27\1\30\1\31\10\27\1\242"+
    "\1\0\6\27\1\0\1\27\1\0\5\27\14\0\1\243"+
    "\26\0\1\27\1\30\1\31\5\27\1\242\3\27\1\0"+
    "\6\27\1\0\1\27\1\0\5\27\4\0\1\27\1\30"+
    "\1\31\11\27\1\0\6\27\1\154\1\127\1\0\5\27"+
    "\10\0\1\244\32\0\1\27\1\30\1\31\1\27\1\245"+
    "\7\27\1\0\6\27\1\0\1\27\1\0\5\27\4\0"+
    "\1\47\1\101\1\102\7\47\1\246\1\47\1\0\6\47"+
    "\1\0\1\47\1\0\5\47\20\0\2\247\21\0\1\47"+
    "\1\101\1\102\11\47\1\247\1\250\5\47\1\0\1\47"+
    "\1\0\5\47\4\0\1\47\1\101\1\102\11\47\1\0"+
    "\1\47\1\251\4\47\1\0\1\47\1\0\5\47\22\0"+
    "\1\252\20\0\1\47\1\101\1\102\11\47\1\0\1\47"+
    "\1\253\4\47\1\0\1\47\1\0\5\47\4\0\1\27"+
    "\1\30\1\31\1\27\1\127\7\27\1\0\6\27\1\0"+
    "\1\27\1\0\5\27\10\0\1\154\64\0\1\254\4\0"+
    "\1\27\1\30\1\31\11\27\1\0\6\27\1\0\1\27"+
    "\1\0\4\27\1\255\4\0\1\47\1\101\1\102\10\47"+
    "\1\256\1\0\6\47\1\0\1\47\1\0\5\47\14\0"+
    "\1\257\26\0\1\47\1\101\1\102\5\47\1\256\3\47"+
    "\1\0\6\47\1\0\1\47\1\0\5\47\4\0\1\47"+
    "\1\101\1\102\11\47\1\0\6\47\2\140\1\0\5\47"+
    "\10\0\1\260\32\0\1\47\1\101\1\102\1\47\1\261"+
    "\7\47\1\0\6\47\1\0\1\47\1\0\5\47\35\0"+
    "\1\262\5\0\1\27\1\30\1\31\11\27\1\0\6\27"+
    "\1\0\1\27\1\0\3\27\1\263\1\27\4\0\1\47"+
    "\1\101\1\102\1\47\1\140\7\47\1\0\6\47\1\0"+
    "\1\47\1\0\5\47\10\0\1\140\64\0\1\264\4\0"+
    "\1\47\1\101\1\102\11\47\1\0\6\47\1\0\1\47"+
    "\1\0\4\47\1\265\31\0\2\266\10\0\1\27\1\30"+
    "\1\31\11\27\1\0\6\27\1\0\1\27\1\266\1\267"+
    "\4\27\35\0\1\270\5\0\1\47\1\101\1\102\11\47"+
    "\1\0\6\47\1\0\1\47\1\0\3\47\1\271\1\47"+
    "\20\0\2\272\21\0\1\27\1\30\1\31\11\27\1\272"+
    "\1\273\5\27\1\0\1\27\1\0\5\27\31\0\2\274"+
    "\10\0\1\47\1\101\1\102\11\47\1\0\6\47\1\0"+
    "\1\47\1\274\1\275\4\47\14\0\1\276\26\0\1\27"+
    "\1\30\1\31\5\27\1\277\3\27\1\0\6\27\1\0"+
    "\1\27\1\0\5\27\20\0\2\300\21\0\1\47\1\101"+
    "\1\102\11\47\1\300\1\301\5\47\1\0\1\47\1\0"+
    "\5\47\35\0\1\150\5\0\1\27\1\30\1\31\11\27"+
    "\1\0\6\27\1\0\1\27\1\0\3\27\1\151\1\27"+
    "\14\0\1\302\26\0\1\47\1\101\1\102\5\47\1\303"+
    "\3\47\1\0\6\47\1\0\1\47\1\0\5\47\35\0"+
    "\1\204\5\0\1\47\1\101\1\102\11\47\1\0\6\47"+
    "\1\0\1\47\1\0\3\47\1\205\1\47";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5580];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\3\1\1\11\12\1\1\11\3\1\2\0"+
    "\1\11\1\1\26\0\1\1\10\0\4\1\4\0\1\11"+
    "\13\0\1\11\1\1\7\0\1\1\10\0\1\1\13\0"+
    "\3\1\1\0\1\1\123\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _CabalSyntaxHighlightingLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _CabalSyntaxHighlightingLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 12: break;
          case 2: 
            { yybegin(YYINITIAL); return CabalTypes.EOL;
            }
          case 13: break;
          case 3: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          case 14: break;
          case 4: 
            { yybegin(WAITING_VALUE); return CabalTypes.COLON;
            }
          case 15: break;
          case 5: 
            { return CabalTypes.VALUE_CHAR;
            }
          case 16: break;
          case 6: 
            { yypushback(1); yybegin(YYINITIAL); return CabalTypes.KEY;
            }
          case 17: break;
          case 7: 
            { yybegin(YYINITIAL); return CabalTypes.COMMENT;
            }
          case 18: break;
          case 8: 
            { return CabalTypes.COMMENT;
            }
          case 19: break;
          case 9: 
            { yybegin(YYINITIAL); return CabalTypes.CONDITIONAL;
            }
          case 20: break;
          case 10: 
            { yypushback(yylength()); yybegin(YYINITIAL); return CabalTypes.EOL;
            }
          case 21: break;
          case 11: 
            { yybegin(YYINITIAL); return CabalTypes.CONFIG;
            }
          case 22: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
